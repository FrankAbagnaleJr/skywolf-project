package com.kyrie.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 冀金梁
 * @since 2023-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_country_sales_day_data")
public class CountrySalesDayData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 国家
     */
    private String country;

    /**
     * 店铺余额
     */
    private Double storeBalance;

    /**
     * 店铺状况分
     */
    private Integer storeStateScore;

    /**
     * IPI
     */
    private Integer storeIpi;

    /**
     * 店铺评论
     */
    private Integer storeReview;

    /**
     * 店铺星级
     */
    private String storeRating;

    /**
     * 店铺销量
     */
    private Long storeSales;

    /**
     * 店铺销售额
     */
    private Double storeSalesMoney;

    /**
     * 退货量
     */
    private Integer returnNum;

    /**
     * 退款额
     */
    private Double returnMoney;

    /**
     * 预估利润
     */
    private Double storeProfit;

    /**
     * 账户余额变动
     */
    private Double storeBalanceChange;

    /**
     * FBA库存
     */
    private Long fbaStock;

    /**
     * FBA库存成本
     */
    private Double fbaStockCost;

    /**
     * FBA预估每日仓储费
     */
    private Double dayStoreFee;

    /**
     * 投入产出比
     */
    private Double roi;

    /**
     * 资金占用
     */
    private Double goz;

    /**
     * 资金流动
     */
    private String gozStream;

    /**
     * 绩效
     */
    private String storeScore;

    /**
     * 备注
     */
    private String note;

    /**
     * 日期
     */
    private LocalDateTime date;


}
