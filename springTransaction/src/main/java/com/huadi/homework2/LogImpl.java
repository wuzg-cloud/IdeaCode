package com.huadi.homework2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Date;
import java.util.UUID;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */

public class LogImpl extends JdbcDaoSupport {

    String uuid = UUID.randomUUID().toString();

    public  void before(JoinPoint joinPoint){
        System.out.println("-------beforeInsert----------");
        String Classname = joinPoint.getTarget().getClass().getName();
        String methodeName = joinPoint.getSignature().getName();
        String sql = "insert into log (id,classname,methodname) values (?,?,?)";
        this.getJdbcTemplate().update(sql,uuid,Classname,methodeName);
    }

  /*  public void after(){
        System.out.println("-------afterInsert----------");
    }*/

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-------aroundInsert----------");
        Long begin = System.currentTimeMillis();
        Object result = null;
        result = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();
        String sql = "update log set  begin =? ,end = ? where id = ?";
        this.getJdbcTemplate().update(sql, new Date(begin),new Date(end),uuid);
        return result;
    }


/*    public void returns(){
        System.out.println("-------returnInsert----------");
    }*/
}
