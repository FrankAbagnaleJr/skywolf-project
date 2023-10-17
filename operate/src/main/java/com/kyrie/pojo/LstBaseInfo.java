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
@TableName("t_lst_base_info")
public class LstBaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sku;

    private String asin;

    private String asinParent;

    private String imageUrl;

    private Long productId;

    private Integer countryId;


}
