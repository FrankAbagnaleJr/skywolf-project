package com.kyrie.service.impl;

import com.kyrie.pojo.Order;
import com.kyrie.mapper.OrderMapper;
import com.kyrie.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
