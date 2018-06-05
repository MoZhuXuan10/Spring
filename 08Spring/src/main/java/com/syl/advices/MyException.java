package com.syl.advices;

public class MyException extends RuntimeException {//自定义异常类
    public MyException(){super();}
    public MyException(String msg){super(msg);}
    public MyException(String msg,Throwable ex){super(msg,ex);}
}
