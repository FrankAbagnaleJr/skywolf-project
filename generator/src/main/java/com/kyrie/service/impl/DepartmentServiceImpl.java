package com.kyrie.service.impl;

import com.kyrie.pojo.Department;
import com.kyrie.mapper.DepartmentMapper;
import com.kyrie.service.DepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
