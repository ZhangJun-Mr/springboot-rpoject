package com.imooc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entities.ProductCategory;

import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
