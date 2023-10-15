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
 * @since 2023-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_store_info")
public class StoreInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer storeId;

    private String storeCode;

    private String storeName;

    private Integer countryId;


}
