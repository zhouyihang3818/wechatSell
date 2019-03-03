package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory=categoryService.findOne(1);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findAll() {
        List<ProductCategory> result=categoryService.findAll();
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> result=categoryService.findByCategoryTypeIn(Arrays.asList(2,3,4));
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory("男生专属",4);
        ProductCategory result=categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}
