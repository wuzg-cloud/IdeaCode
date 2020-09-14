package com.huadi.homework.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Date;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Object;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao{
    public void addProduct(String name, Date date, int num) {
        String sql = "insert into product (p_name,p_date,p_num) values (?,?,?)";
        this.getJdbcTemplate().update(sql,name,date,num);
    }

    public void deleteProduct(String name) {
        String sql="delete from product where p_name = ?";
        this.getJdbcTemplate().update(sql,name);
    }
}
