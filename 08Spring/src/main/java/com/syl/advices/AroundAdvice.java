package com.syl.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
    /**
     * invoke:在前置通知之后,后置通知之前执行!
     * @param methodInvocation  方法的执行器
     *                     MethodInvocation接口中只有一个getMethod()
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行之前 环绕通知");
        /**
         * 方法的执行 proceed
         * result 代表方法的返回值
         * 有的方法有返回值
         * 有的方法没有返回值
         */
        Object result=methodInvocation.proceed();
        if(result!=null){
            result="两个馒头";
        }
        System.out.println("方法执行之后 环绕通知");
        return result;
    }
}
