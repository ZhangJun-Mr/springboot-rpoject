package com.imooc.service.impl;

import com.imooc.entities.SellerInfo;
import com.imooc.mapper.SellerInfoMapper;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SqMax on 2018/4/1.
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoMapper.selectById(openid);
    }
}
