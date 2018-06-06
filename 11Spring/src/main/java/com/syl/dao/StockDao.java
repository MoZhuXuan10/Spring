package com.syl.dao;

public interface StockDao {


    /**
     *  谁的股票增加了多少
     * @param sname 用户名
     * @param amount  股票数量
     */
    void  updateStock(String sname, int amount);
}
