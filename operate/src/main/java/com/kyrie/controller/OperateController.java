package com.kyrie.controller;

import com.alibaba.excel.EasyExcel;
import com.kyrie.config.excel.ExcelImportListener;
import com.kyrie.exception.BizException;
import com.kyrie.page.PageDto;
import com.kyrie.pojo.Order;
import com.kyrie.pojo.dto.OrderQueryDto;
import com.kyrie.pojo.dto.OrderQueryParamDto;
import com.kyrie.result.Result;
import com.kyrie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


/**
 * @auther: jijin
 * @date: 2023/10/15 14:43 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description 运营模块接口类
 */

@RestController
@RequestMapping("/v1")
public class OperateController {

    @Autowired
    private OrderService orderService;

    /**
     * 订单导入系统，把excel订单文件导入到系统
     * @param file excel文件
     * @return
     */
    @PostMapping("/inputOrder")
    public Result<String> inputOrder(@RequestParam("file") MultipartFile file){
        try {
            Result<String> result = new Result<>();
            String message = orderService.inputOrderByExcel(file);
            result.setMessage(message);
            return result;
        } catch (IOException e) {
            throw new BizException("订单导入异常！ 异常文件：" +file.getName());
        }
    }

    /**
     * 多条件查询订单接口
     * @param params 根据订单号、时间、产品名字、ASIN、SKU、负责人等查询
     * @return
     */
    @PostMapping("/queryOrder")
    public Result<List<OrderQueryDto>> queryOrder(PageDto page, @RequestBody(required = false) OrderQueryParamDto params){
        List<OrderQueryDto> list = orderService.queryOrderByParams(page,params);
        return Result.success(list);
    }


}
