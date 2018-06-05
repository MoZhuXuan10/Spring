package com.syl.dao.impl;

import com.syl.advices.MyException;
import com.syl.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public String eat() {
        System.out.println("正在吃饭eat……");
        return "馒头";
    }

    public void sleep() {
        System.out.println("正在睡觉……");
    }

    public boolean login(String name, String password) throws MyException {
        if (!"admin".equals(name)) {
            throw new MyException("用户名错误");
        }
        if (!"admin".equals(password)) {
            throw new MyException("密码错误");
        }
        return true;
    }
}
