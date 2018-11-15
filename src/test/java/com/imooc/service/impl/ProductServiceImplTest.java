package com.imooc.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.entities.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo=productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList=productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
/*        PageRequest request=new PageRequest(0,2);
        IPage<ProductInfo> productInfoIPage = new
        Page<ProductInfo> productInfoPage= productService.findAll();
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());*/
    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的虾");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        boolean result=productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale(){
       boolean result =productService.onSale("123456");
        Assert.assertEquals(ProductStatusEnum.UP,result);

    }

    @Test
    public void offSale(){
        boolean result=productService.offSale("123456");
        Assert.assertEquals(ProductStatusEnum.DOWN,result);

    }
}