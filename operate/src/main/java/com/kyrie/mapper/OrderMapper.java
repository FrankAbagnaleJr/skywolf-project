package com.kyrie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kyrie.page.PageParam;
import com.kyrie.pojo.Order;
import com.kyrie.pojo.dto.OrderQueryDto;
import com.kyrie.pojo.dto.OrderQueryParamDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 冀金梁
 * @since 2023-10-17
 */
public interface OrderMapper extends BaseMapper<Order> {

//    List<OrderQueryDto> selectOrderByParams(@Param("page") PageParam page, @Param("params")  OrderQueryParamDto params);
    List<List<?>> selectOrderByParams(@Param("page") PageParam page, @Param("params")  OrderQueryParamDto params);
}
