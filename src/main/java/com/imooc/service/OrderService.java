package com.imooc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.dto.OrderDTO;
import com.imooc.entities.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by SqMax on 2018/3/18.
 */
public interface OrderService{

    /**
     * 创建订单
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     */
    IPage<OrderDTO> findList(IPage<OrderMaster> page, String buyerOpenid);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);
}
