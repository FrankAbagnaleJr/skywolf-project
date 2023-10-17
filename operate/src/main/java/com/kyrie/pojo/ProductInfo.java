package com.kyrie.pojo;

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
 * @since 2023-10-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_product_info")
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品id
     */
    private Long id;

    /**
     * 产品长
     */
    private Double productLength;

    /**
     * 产品宽
     */
    private Double productWide;

    /**
     * 产品高
     */
    private Double productHigh;

    /**
     * 包裹长
     */
    private Double packageLength;

    /**
     * 包裹宽
     */
    private Double packageWide;

    /**
     * 包裹高
     */
    private Double packageHigh;

    /**
     * 净重
     */
    private Double productWeight;

    /**
     * 毛重
     */
    private Double grossWeigh;

    /**
     * 成本
     */
    private Double cost;

    /**
     * 采购链接
     */
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

    /**
     * 产品名字
     */
    private String name;


}
