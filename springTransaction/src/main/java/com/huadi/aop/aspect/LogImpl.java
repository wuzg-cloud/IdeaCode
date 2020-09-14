package com.huadi.aop.aspect;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class LogImpl {
    public  void beforeInsert(){
        System.out.println("-------beforeInsert----------");
    }
    public void afterInsert(){
        System.out.println("-------afterInsert----------");
    }
    public void aroundInsert(){
        System.out.println("-------aroundInsert----------");
    }
    public void returnInsert(){
        System.out.println("-------returnInsert----------");
    }
}
