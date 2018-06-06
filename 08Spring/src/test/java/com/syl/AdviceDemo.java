package com.syl;

import com.syl.advices.MyException;
import com.syl.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceDemo {
    @Test
    public void testBefore() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /**
         * 获取的是代理工厂 返回的是目标对象
         */
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        userDao.eat();
        System.out.println("***********************");
        userDao.sleep();
    }

    @Test //后置通知
    public void testAfter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        userDao.eat();
    }
    @Test //环绕通知
    public void  testAround(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao= context.getBean("userProxy",UserDao.class);
        String  result=userDao.eat();
        System.out.println(result);
    }
    @Test //异常通知
    public void  testException(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao= context.getBean("exceptionProxy",UserDao.class);
        try {
            userDao.login("aa","admin");
        }catch (MyException ex){
            ex.printStackTrace();
        }
    }

    /**
     *  使用顾问  advisor.xml
     */
    @Test //前置通知
    public void  testAdvisor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("advisor.xml");
        UserDao userDao= context.getBean("userProxy",UserDao.class);
        userDao.eat();
        userDao.sleep();
    }
    /**
     *  使用顾问  regex.xml
     */
    @Test //前置通知
    public void  testRegex(){
        ApplicationContext context=new ClassPathXmlApplicationContext("regex.xml");
        UserDao userDao= context.getBean("userProxy",UserDao.class);
        userDao.eat();
        userDao.ea();
        userDao.e();
        userDao.sleep();
    }
}
