package com.syl.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectJ {
    @Before("execution(* *..UserDao.sleep(..))")
    public void before(){
        System.out.println("前置增强........");
    }
    @AfterReturning("execution(* *..UserDao.sleep(..))")
    public void  afterReturning(){
        System.out.println("后置增强........");
    }
    //如果想获取方法的返回值
    @AfterReturning(value = "execution(* *..UserDao.sleep(..))",returning = "result")
    public void  afterReturning(String result){
        System.out.println("后置增强........"+result);
    }
    /**
     * 环绕增强可以改变返回值
     */
    @Around("execution(* *..UserDao.eat(..))")
    public Object  around(ProceedingJoinPoint point){
        System.out.println("环绕增强进来........");
        Object result=null;
        try {
            result=  point.proceed(); //执行目标方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强出去........");
        return  "orange";
    }
}
