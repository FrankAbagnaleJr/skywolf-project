package com.kyrie.pojo;

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
@TableName("t_fba_stock_day_data")
public class FbaStockDayData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String asin;

    private Integer fbaSaleNum;

    private Integer fbaAllocateNum;

    private Integer fbaNoSaleNum;

    private Integer fbaWayNum;

    private Integer countryId;

    private LocalDateTime date;


}
