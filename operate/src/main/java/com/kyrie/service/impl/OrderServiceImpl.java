package com.kyrie.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kyrie.config.excel.ExcelImportListener;
import com.kyrie.mapper.OrderMapper;
import com.kyrie.page.PageDto;
import com.kyrie.pojo.Order;
import com.kyrie.pojo.ProductInfo;
import com.kyrie.pojo.dto.OrderQueryDto;
import com.kyrie.pojo.dto.OrderQueryParamDto;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
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
    public List<OrderQueryDto>  queryOrderByParams(PageDto pageDto, OrderQueryParamDto params) {

        //分页参数
        Long pageNum = pageDto.getPageNum();
        Long pageSize = pageDto.getPageSize();
        //订单号
        String orderId = params.getOrderId();
        //订单状态
        String orderState = params.getOrderState();
        //产品名字
        String procuctName = params.getProcuctName();
        //asin
        String asin = params.getAsin();
        //sku
        String sku = params.getSku();
        //负责人
        String manager = params.getManager();
        //订单日期
        Date orderDate = params.getOrderDate();

        List<OrderQueryDto> list =  orderMapper.selectOrderByParams(pageDto,params);


        return list;
    }
}
