package com.kyrie.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    @ExcelProperty("订单号")
    private String orderId;
    @ExcelProperty("订单金额")
    private Double orderMoney;
    @ExcelProperty("订单数量")
    private Integer orderNum;
    @ExcelProperty("订单状态")
    private String orderState;
    //    @ExcelProperty("订单产品")
//    private Integer productId;
    @ExcelProperty("订单产品")
    private String sku;

    @ExcelProperty("订单国家")
    private Integer countryId;
    @ExcelProperty("时间")
    private LocalDateTime date;


}
