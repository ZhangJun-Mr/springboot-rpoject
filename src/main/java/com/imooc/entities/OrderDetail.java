package com.imooc.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Created by SqMax on 2018/3/18.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OrderDetail extends BaseEntity{
    private String detailId;

    /**
     * 订单id
     */
    @TableId
    private String orderId;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;

}
