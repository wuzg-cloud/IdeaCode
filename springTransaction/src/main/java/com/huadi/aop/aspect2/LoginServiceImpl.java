package com.huadi.aop.aspect2;

import org.springframework.stereotype.Component;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class LoginServiceImpl implements LoginService{
    public void addUser() {

        System.out.println("--------addUser--------");
    }

    public void deleteUser() {
        System.out.println("--------deleteUser--------");
    }

    public void updateUser() {
        System.out.println("--------updateUser--------");
    }

    public void selectUser() {
        int i = 100 / 0;
        System.out.println("--------selectUser--------");
    }
}
