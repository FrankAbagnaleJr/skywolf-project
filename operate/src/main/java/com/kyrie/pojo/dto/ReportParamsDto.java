package com.kyrie.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/18 16:58 周三
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description TODO
 */
@Data
public class ReportParamsDto {
    //订单开始时间
    private LocalDate start;
    //订单结束时间
    private LocalDate end;
    //报表类型
    private String reportType;
    //部门
    private String department;
    //负责人
    private String manager;
    //sku
    private String sku;
    //国家
    private String country;
}
