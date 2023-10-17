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
@TableName("t_dic_lst_state")
public class DicLstState implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单状态编号
     */
    private Integer id;

    /**
     * 订单状态
     */
    private String stste;


}
