package com.syl.advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    /**
     * 在目标方法执行之前 执行
     * @param returnValue   目标方法的返回值,我们只能看,能改,但是没意义
     * @param method   目标方法
     * @param objects  方法中的参数列表
     * @param target    目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了***************后置通知***************");
    }
}
