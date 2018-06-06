package com.syl;

import com.syl.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public  void  defaultTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao dao= context.getBean("userDao", UserDao.class);
        //UserDao dao= context.getBean("userDao2", UserDao.class);  也会被注入增强方法
        dao.eat();
        dao.sleep();
    }
    @Test
    public  void  beanNameTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beanName.xml");
        UserDao dao= context.getBean("userDao", UserDao.class);
        //UserDao dao= context.getBean("userDao2", UserDao.class);  也会被注入增强方法
        dao.eat();
        dao.sleep();
    }

}
