package com.syl;

import com.syl.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

public class StudentDemo implements Serializable {
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-student.xml","spring-grade.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
