package com.kyrie.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kyrie.config.excel.ExcelImportListener;
import com.kyrie.mapper.OrderMapper;
import com.kyrie.page.PageParam;
import com.kyrie.pojo.Order;

import com.kyrie.pojo.dto.OrderQueryDto;
import com.kyrie.pojo.dto.OrderQueryParamDto;
import com.kyrie.pojo.dto.ReportDto;
import com.kyrie.pojo.dto.ReportParamsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @auther: jijin
 * @date: 2023/10/15 18:54 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements com.kyrie.service.OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ExcelImportListener listener;

    @Override
    public String inputOrderByExcel(MultipartFile multipartFile) throws IOException {
        if (multipartFile == null) return "请上传excel文件！";
        EasyExcel.read(multipartFile.getInputStream(),Order.class,listener).sheet().doRead();
        return "订单导入成功！";
    }

    @Override
    public List<List<?>>  queryOrderByParams(PageParam page, OrderQueryParamDto params) {

        //校验分页参数，不合法默认是1，10
        long pageNum =0L;
        long pageSize=10L;
        if(page.getPageNum() > 0) pageNum = page.getPageNum() - 1;
        if (page.getPageSize() >= 1) pageSize = page.getPageSize();

        //校验日期范围，默认是只查询近7天的订单
        if (Objects.isNull(params.getAftereData()) && Objects.isNull(params.getBeforeData())) {
            params.setAftereData(LocalDate.now());
            params.setBeforeData(LocalDate.now().minusDays(7));

        }

        //如果日期范围选反了，那么调换位置
        if (params.getBeforeData().isAfter(params.getAftereData())) {
            LocalDate temp = params.getBeforeData();
            params.setBeforeData(params.getAftereData());
            params.setAftereData(temp);
        }
        List<List<?>> list = orderMapper.selectOrderByParams(new PageParam(pageNum, pageSize), params);
//        List<OrderQueryDto> list1 = (List<OrderQueryDto>) list.get(0);
//        Integer total = (Integer) list.get(1).get(0);
        return list;
    }

    @Override
    public List<ReportDto> getReport(ReportParamsDto params) {


        //如果没选时间，默认近7天的数据
        if (Objects.isNull(params.getStart()) && Objects.isNull(params.getEnd())) {
            params.setStart(LocalDate.now().minusDays(7));
            params.setEnd(LocalDate.now());
        }
        List<ReportDto> list =  orderMapper.getReport(params);
        return list;
    }

}
