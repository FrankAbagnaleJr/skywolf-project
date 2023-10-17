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
@TableName("t_store_info")
public class StoreInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    private Integer id;

    /**
     * 店铺唯一识别码
     */
    private String storeCode;

    /**
     * 店铺名字
     */
    private String storeName;

    /**
     * 国家id
     */
    private Integer countryId;


}
