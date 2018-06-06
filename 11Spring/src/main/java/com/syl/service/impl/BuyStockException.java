package com.syl.service.impl;

public class BuyStockException extends RuntimeException {
    public BuyStockException(String msg){
        super(msg);
    }
    public BuyStockException(String msg, Throwable a){
        super(msg,a);
    }
}
