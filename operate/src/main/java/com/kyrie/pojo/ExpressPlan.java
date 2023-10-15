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
@TableName("t_express_plan")
public class ExpressPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Integer expressCode;

    /**
     * 运输方式
     */
    private Integer expressPlan;


}
