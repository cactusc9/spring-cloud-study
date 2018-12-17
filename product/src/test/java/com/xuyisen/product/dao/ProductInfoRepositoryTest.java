package com.xuyisen.product.dao;

import com.xuyisen.product.ProductApplicationTests;
import com.xuyisen.product.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    ProductInfoRepository productInfoRepository;


    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(productInfoList.size()==2);
    }
}