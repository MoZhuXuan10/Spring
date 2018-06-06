package com.syl.service.impl;

import com.syl.dao.AccountDao;
import com.syl.dao.StockDao;
import com.syl.service.BuyStockService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyStockServiceImpl implements BuyStockService {

    private AccountDao accountDao;
    private StockDao stockDao;
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = BuyStockException.class)
    public void buyStock(String name, double money, int amount) {
        //一人减钱
        accountDao.updateAccount(name,money);
//        if(1==1){
//            throw new BuyStockException("购买股票失败");
//        }
        stockDao.updateStock(name,amount);
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
