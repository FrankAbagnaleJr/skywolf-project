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
@TableName("t_dic_country")
public class DicCountry implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String countryId;

    /**
     * 国家缩写
     */
    private String countryCode;

    /**
     * 国家
     */
    private String country;


}
