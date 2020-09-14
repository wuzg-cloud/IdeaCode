package com.huadi.homework.dao;

import java.sql.Date;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public interface ProductDao {
    void addProduct(String name, Date date,int num);
    void deleteProduct(String name);
}
