package com.huadi.service;

import com.huadi.dao.AccountDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class AccountServiceImpl2 implements AccountService{
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outAccount, String inAccount, int money) {
        accountDao.outMoney(outAccount,money);
        int i = 100 / 0;
        accountDao.inMoney(inAccount,money);
    }
}
