package com.syl.advices;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(MyException ex){
        System.out.println("进入了 异常通知");
        System.out.println(ex.getMessage());
    }
}
