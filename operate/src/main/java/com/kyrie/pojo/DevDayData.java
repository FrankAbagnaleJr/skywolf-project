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
@TableName("t_dev_day_data")
public class DevDayData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String asin;

    private String sku;

    private Long advOrder;

    private Double advConsume;

    private Double advSalesMoney;

    private Long browse;

    private Long click;

    private Double ctr;

    private Double cvr;

    private Double clickFee;

    private Double acos;

    private Integer plan;

    private Integer countryId;

    private LocalDateTime date;


}
