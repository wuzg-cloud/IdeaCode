package com.huadi.homework.service;

import com.huadi.homework.dao.ProductDao;

import java.sql.Date;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public class ProductServiceImpl2 implements ProductService{
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    public void testAddDelete(String name, Date date, int num) {
        productDao.addProduct(name, date, num);
        productDao.deleteProduct(name);
    }
}
