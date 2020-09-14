package com.huadi.aop.test;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class PojoImpl implements Pojo {
    public void foo() {
        //bar();
        ((Pojo)AopContext.currentProxy()).bar();//创建代理类
    }

    public void bar() {
        System.out.println("-----bar方法------");
    }

    public static void main(String[] args) {
        /*Pojo pojo = new PojoImpl();
        pojo.foo();*/
        //新建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(new PojoImpl());
        //添加代理类
        proxyFactory.addInterface(Pojo.class);
        //获取代理
        Pojo pojo = (Pojo) proxyFactory.getProxy();
        pojo.bar();
    }
}
