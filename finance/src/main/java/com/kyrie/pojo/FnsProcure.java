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
 * @since 2023-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_fns_procure")
public class FnsProcure implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private LocalDateTime date;

    private String store;

    private String saleImage;

    private String asin;

    private String applicant;

    private String procureReason;

    private String procureImage;

    private String productName;

    private String procureUrl;

    private String procureModel;

    private Integer procureNum;

    private Double procurePrice;

    private String aboutFee;

    private String note;

    private String procureMarket;

    private String orderNum;

    private String payFee;

    private String expressType;

    private String expressNum;

    private String orderState;


}
