package com.syl;

import com.syl.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean生命周期
 */
public class LifeCycle {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
