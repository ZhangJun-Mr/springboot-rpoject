package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.entities.ProductCategory;

import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
