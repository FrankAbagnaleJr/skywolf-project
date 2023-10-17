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
@TableName("t_employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    private Integer id;

    /**
     * 员工名字
     */
    private String name;

    /**
     * 员工年龄
     */
    private Integer age;

    /**
     * 职位
     */
    private String job;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 领导id
     */
    private Integer managerId;


}
