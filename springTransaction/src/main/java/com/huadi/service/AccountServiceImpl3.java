package com.huadi.service;

import com.huadi.dao.AccountDao;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public class AccountServiceImpl3 implements AccountService{
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outAccount, String inAccount, int money) {
        accountDao.outMoney(outAccount, money);
        //int i = 100 / 0;
        String[] strings = new String[]{"a","b"};
        System.out.println(strings[4]);
        accountDao.inMoney(inAccount, money);
    }
}
