package com.syl.dao.impl;

import com.syl.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public String eat() {
        System.out.println("正在吃饭……");
        return "Apple";
    }

    @Override
    public void sleep() {
        System.out.println("正在睡觉……");
    }
}
