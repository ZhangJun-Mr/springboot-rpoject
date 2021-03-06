package com.imooc.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.entities.SellerInfo;
import com.imooc.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by SqMax on 2018/3/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");

        int result = sellerInfoMapper.updateById(sellerInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOpenid() throws Exception {
        QueryWrapper<SellerInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("openid", "abc");
        SellerInfo result = sellerInfoMapper.selectOne(queryWrapper);
        Assert.assertEquals("abc", result.getOpenid());

    }
}