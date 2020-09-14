package com.huadi.service;

import com.huadi.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

/*    public void transfer(String outAccount, String inAccount, int money) {
        accountDao.outMoney(outAccount,money);
        int i = 1/0;
        accountDao.inMoney(inAccount,money);
    }*/
    public void transfer(final String outAccount, final String inAccount, final int money) { //编程式事务管理
        transactionTemplate.execute(new TransactionCallbackWithoutResult() { //匿名内部类实现回调方法
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(outAccount, money);
                int i = 100 / 0;//出现异常，转账失败
                accountDao.inMoney(inAccount, money);
            }
        });
    }
}
