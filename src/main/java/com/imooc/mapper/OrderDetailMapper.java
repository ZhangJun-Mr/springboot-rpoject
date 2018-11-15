package com.imooc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entities.OrderDetail;

import java.util.List;

/**
 * Created by SqMax on 2018/3/18.
 */
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

    List<OrderDetail> findByOrderId(String orderId);
}
