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
@TableName("t_lst_coupon_day_data")
public class LstCouponDayData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String asin;

    private String saleKill;

    private String prime;

    private String coupon;

    private String discounts;

    private String isDiscountsAnd;

    private Integer countryId;

    private LocalDateTime date;


}
