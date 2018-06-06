package com.syl.dao;

public interface AccountDao {

    /**
     *  谁花了多少钱
     * @param aname 用户名
     * @param money  金额
     */
    void  updateAccount(String  aname,double money);


}
