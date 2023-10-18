package com.kyrie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyrie.page.PageParam;
import com.kyrie.pojo.Order;
import com.kyrie.pojo.dto.OrderQueryDto;
import com.kyrie.pojo.dto.OrderQueryParamDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @auther: jijin
 * @date: 2023/10/15 18:53 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
public interface OrderService extends IService<Order> {

    String inputOrderByExcel(MultipartFile multipartFile) throws IOException;

    List<OrderQueryDto> queryOrderByParams(PageParam pageParam, OrderQueryParamDto params);

}
