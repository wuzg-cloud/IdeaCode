package com.huadi.service;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
public interface AccountService {
    void transfer(String outAccount,String inAccount,int money);
}
