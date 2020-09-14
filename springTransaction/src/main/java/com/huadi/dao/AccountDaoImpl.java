package com.huadi.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    public void inMoney(String inAccount, int money) {
        String sql="update transaction set money = money + ? where name = ?";
        System.out.println(sql);
        this.getJdbcTemplate().update(sql,money,inAccount);
    }

    public void outMoney(String outAccount, int money) {
        String sql="update transaction set money = money - ? where name = ?";
        System.out.println(sql);
        this.getJdbcTemplate().update(sql,money,outAccount);

    }
}
