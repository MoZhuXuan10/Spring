package com.syl.service.impl;

import com.syl.dao.StudentDao;
import com.syl.service.StudentService;

public class StudentServiceImpl implements StudentService {


    public  StudentServiceImpl(){
        System.out.println("StudentServiceImpl========实例化");
    }

    /**
     * 之前耦合的方式
     * 程序本身去创建dao层的实例
     *  StudentDao dao=new StudentDaoImpl();
     */
    StudentDao dao;
    public StudentDao getDao() {
        return dao;
    }
    /**
     01.只是定义了一个dao层的对象
     02.需要交给spring容器
     03.等待spring容器给我赋值   通过setDao()
     */

    public void setDao(StudentDao dao) {
        System.out.println("执行了======》setDao");
        this.dao = dao;
    }

    /**
     * 打招呼的方法
     */
    @Override
    public void sayHello() {
        System.out.println("开始记录日志");  //系统级业务
        dao.sayHello();
        System.out.println("结束记录日志"); //系统级业务
    }

    /**
     * @return 吃饭方法
     */
    @Override
    public String eat() {
        System.out.println("开始记录日志");  //系统级业务
        String stu=dao.eat();
        System.out.println("结束记录日志"); //系统级业务
        return stu;
    }
}