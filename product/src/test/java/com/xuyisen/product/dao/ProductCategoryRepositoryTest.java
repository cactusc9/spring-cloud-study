package com.xuyisen.product.dao;

import com.xuyisen.product.ProductApplicationTests;
import com.xuyisen.product.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class ProductCategoryRepositoryTest extends ProductApplicationTests {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryList = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 2, 3));
        Assert.assertTrue(categoryList.size()==1);
    }
}