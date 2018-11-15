package com.imooc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.dto.CartDTO;
import com.imooc.entities.ProductInfo;

import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
public interface ProductService extends IService<ProductInfo> {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    IPage<ProductInfo> findAll(IPage<ProductInfo> page, ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    boolean onSale(String productId);

    //下架
    boolean offSale(String productId);
}
