package com.syl;

import com.syl.bean.Grade;
import com.syl.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyDemo {
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //获取指定的年级
        Grade grade=  (Grade)context.getBean("grade", Grade.class);
        System.out.println(grade);
        //获取指定的学生
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}
