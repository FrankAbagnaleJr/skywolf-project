package com.kyrie.pojo.dto;

import lombok.Data;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/18 16:59 周三
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description TODO
 */
@Data
public class ReportDto {
    //销售额
    Double saleMoney;
    //销量
    Integer saleNum;
    //广告销售额
    Double devSaleMoney;
    //广告花费
    Double devMoney;
    //广告销量
    Integer devSaleNum;
    //广告投入产出比ACOS
    Double acos;
    //其他推广费用
    Double otherConsume;
    //退款损失
    Double returnLoss;
    //退货量
    Integer returnNum;
    //退货率
    Double returnRate;
    //纯利润
    Double netProfit;
    //投入产出比ROI
    Double roi;
}
