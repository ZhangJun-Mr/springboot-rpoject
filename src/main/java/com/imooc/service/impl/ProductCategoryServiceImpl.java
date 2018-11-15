package com.imooc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.entities.ProductCategory;
import com.imooc.mapper.ProductCategoryMapper;
import com.imooc.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper,ProductCategory> implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return this.getById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        QueryWrapper<ProductCategory> queryWrapper = new QueryWrapper<>();
        return super.list(queryWrapper);
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        QueryWrapper<ProductCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("category_type", categoryTypeList);
        return super.list(queryWrapper);
    }

    @Override
    public boolean save(ProductCategory productCategory) {
        return super.save(productCategory);
    }
}
