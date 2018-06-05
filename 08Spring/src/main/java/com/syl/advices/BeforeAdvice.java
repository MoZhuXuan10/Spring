package com.syl.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {

    /**
     * 在目标方法执行之前执行
     * @param method  目标方法
     * @param objects  方法中的参数列表
     * @param target   目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了***********前置通知***********");
    }
}
