package com.kyrie.service.impl;

import com.kyrie.pojo.Employee;
import com.kyrie.mapper.EmployeeMapper;
import com.kyrie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 冀金梁
 * @since 2023-10-15
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
