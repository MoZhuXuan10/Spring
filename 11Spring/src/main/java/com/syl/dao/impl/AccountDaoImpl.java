package com.syl.dao.impl;

import com.syl.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    /**
     * 谁花了多少钱
     *
     * @param aname 用户名
     * @param money 金额
     */
    @Override
    public void updateAccount(String aname, double money) {
        String sql="update account  set balance=balance-? where aname=?";
        this.getJdbcTemplate().update(sql,money,aname);
    }
}
