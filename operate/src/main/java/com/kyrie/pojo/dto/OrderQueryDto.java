package com.kyrie.pojo.dto;

import com.kyrie.pojo.Employee;
import com.kyrie.pojo.LstBaseInfo;
import com.kyrie.pojo.Order;
import com.kyrie.pojo.ProductInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.math3.stat.descriptive.summary.Product;

import java.util.Date;

/**
 * @auther: jijin
 * @date: 2023/10/15 21:43 周日
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderQueryDto extends Order {
    private LstBaseInfo listing;
    private String product;
    private String manager;
    private String country;

}
