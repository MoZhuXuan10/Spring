package com.syl.dao.impl;

import com.syl.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
    public StudentDaoImpl(){
        System.out.println("StudentDaoImpl=======实例化");
    }

    /**
     * 打招呼的方法
     */
    @Override
    public void sayHello() {
        System.out.println("学生打招呼的方法");
    }

    /**
     * @return 吃饭方法
     */
    @Override
    public String eat() {
        System.out.println("学生吃饭方法");
        return "apple";
    }
}
