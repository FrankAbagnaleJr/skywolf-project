package com.kyrie.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
@TableName("t_pruduct_info")
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long productId;

    private String name;

    private Double productLength;

    private Double productWide;

    private Double productHigh;

    private Double packageLength;

    private Double packageWide;

    private Double packageHigh;

    private Double productWeight;

    private Double grossWeigh;

    private Double cost;

    private String buyUrl;

    /**
     * FBA配送费
     */
    private Integer fbaFee;

    /**
     * 物流方式
     */
    private Integer expressCode;

    /**
     * 负责人
     */
    private Integer userId;


}
