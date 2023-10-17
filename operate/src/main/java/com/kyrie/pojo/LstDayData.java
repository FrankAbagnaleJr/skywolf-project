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
 * @since 2023-10-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_lst_day_data")
public class LstDayData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String asin;

    private String lstStateCode;

    private Integer sellerNum;

    private Double salesMoney;

    private Double price;

    private Double estimateProfit;

    private Long sales;

    private String classBig;

    private Long classBigRank;

    private String classSmal;

    private Long classSmalRank;

    private Long reviewNum;

    private Double rating;

    private Long buyerVisits;

    private Long pageVisits;

    private String buyerSound;

    private Long returnNum;

    private Double returnMoney;

    private String note;

    private Integer countryId;

    private LocalDateTime date;


}
