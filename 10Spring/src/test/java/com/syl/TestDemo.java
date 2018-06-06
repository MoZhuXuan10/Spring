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
        //  System.out.println(dao.eat());
        dao.sleep();
    }
    @Test
    public  void  aspectJTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspectJ.xml");
        UserDao dao= context.getBean("userDao", UserDao.class);
        //System.out.println(dao.eat());
        dao.sleep();
    }
}
