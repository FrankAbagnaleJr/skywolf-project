package com.kyrie.config.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.kyrie.exception.BizException;
import com.kyrie.pojo.Order;
import com.kyrie.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @auther: jijin
 * @date: 2023/10/15 18:52 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description 导入监听器
 */
@Component
//多例
@Scope("prototype")
@Slf4j
public class ExcelImportListener extends AnalysisEventListener<Order> {

    @Autowired
    private OrderService orderService;

    @Override
    public void invoke(Order order, AnalysisContext analysisContext) {
        boolean save = orderService.save(order);
        if (!save) {
            log.error("数据导入失败！ "+ order.getId());
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("数据导入成功！");
    }
}
