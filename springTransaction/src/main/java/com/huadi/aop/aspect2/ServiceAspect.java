package com.huadi.aop.aspect2;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;
import java.util.logging.Logger;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
@Aspect
public class ServiceAspect {
    //around-before-after-afterReturning
    private final Logger logger = Logger.getLogger(String.valueOf(this.getClass()));
    //切入点
    private final String Point_cut = "execution(* com.huadi.aop.aspect2.LoginServiceImpl.*(..))";
    //建立一个空方法作为切入点
    @Pointcut(Point_cut)
    private void pointcut(){

    }

    //前置通知
    @Before(value ="execution(* com.huadi.aop.aspect2.LoginServiceImpl.*(..))")
    public void before(JoinPoint joinPoint){
        String Classname = joinPoint.getTarget().getClass().getName();
        String methodeName = joinPoint.getSignature().getName();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("---------前置通知----------");
        System.out.println(Classname);
        System.out.println(methodeName);
        Object[] objects = joinPoint.getArgs();
        for (Object object :objects){
            stringBuilder.append(JSON.toJSONString(object));
            logger.info(stringBuilder.toString());
        }
    }

    //最终通知
    @After(value = Point_cut)
    public void After(JoinPoint joinPoint){
        String Classname = joinPoint.getTarget().getClass().getName();
        String methodeName = joinPoint.getSignature().getName();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("---------最终通知----------");
        System.out.println(Classname);
        System.out.println(methodeName);
        Object[] objects = joinPoint.getArgs();
        for (Object object :objects){
            stringBuilder.append(JSON.toJSONString(object));
            logger.info(stringBuilder.toString());
        }
    }

    //环绕通知
    @Around(value = Point_cut)
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("--------环绕通知--------");
        Long begin = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        Object result = null;
        result = joinPoint.proceed(); //拦截的方法执行
        System.out.println(stringBuilder);
        Long end = System.currentTimeMillis();
        System.out.println("开始时间："+new Date(begin));
        System.out.println("结束时间："+new Date(end));
        return result;
    }

    //返回通知
    @AfterReturning(value = Point_cut,returning = "returnObj")
    public void afterReturning(Object returnObj){
        String result = JSON.toJSONString(returnObj);
        System.out.println("----------返回通知-------------");
        System.out.println(result);
    }

    //异常通知
    @AfterThrowing(value = Point_cut,throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("----------异常通知----------");
        System.out.println(e);
    }
}
