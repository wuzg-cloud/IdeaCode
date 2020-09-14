package com.huadi.homework.service;

import com.huadi.homework.dao.ProductDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class ProductServiceImpl implements ProductService{
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void testAddDelete(String name, Date date, int num) {
        productDao.addProduct(name, date, num);
        productDao.deleteProduct(name);
    }
}
