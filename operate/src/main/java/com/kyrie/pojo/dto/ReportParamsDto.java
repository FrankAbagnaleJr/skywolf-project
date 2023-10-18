package com.kyrie.pojo.dto;

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
    private LocalDate start;
    private LocalDate end;
    private String reportType;
    private String department;
    private String userName;
    private String product;
    private String country;
}
