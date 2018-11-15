package com.imooc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entities.ProductInfo;

import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
