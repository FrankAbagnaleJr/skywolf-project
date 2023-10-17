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
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String id;

    /**
     * 订单金额
     */
    private Double money;

    /**
     * 订单数量
     */
    private Integer num;

    /**
     * sku
     */
    private String sku;

    /**
     * 国家编号
     */
    private Integer countryId;

    /**
     * 订单日期
     */
    private LocalDateTime date;

    /**
     * 订单状态
     */
    private String state;


}
