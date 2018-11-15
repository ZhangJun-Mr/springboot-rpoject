package com.imooc.entities;

import com.imooc.enums.ProductStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by SqMax on 2018/3/17.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ProductInfo extends BaseEntity {
    private String productId;

    /**
     * 名字
     **/
    private String productName;

    /**
     * 单价
     **/
    private BigDecimal productPrice;

    /**
     * 库存
     **/
    private Integer productStock;

    /**
     * 描述
     **/
    private String productDescription;

    /**
     * 小图
     **/
    private String productIcon;

    /**
     * 状态，0正常，1下架
     **/
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /**
     * 类目编号
     **/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
