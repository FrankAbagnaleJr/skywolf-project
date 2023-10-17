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
@TableName("t_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 部门
     */
    private String name;


}
