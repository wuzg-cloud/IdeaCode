package com.huadi.dao;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public interface AccountDao {
    void inMoney(String inAccount,int money);
    void outMoney(String outAccount,int money);
}
