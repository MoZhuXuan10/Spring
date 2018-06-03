package com.syl;

import com.syl.bean.Student;
import com.syl.service.StudentService;
import com.syl.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentDemo {
    ApplicationContext context=null;
    StudentService service=null;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring.xml");
        service=context.getBean("studentService", StudentServiceImpl.class);
    }
    @Test
    public void add(){
        service.add(new Student(1,"小黑黑"));
        System.out.println("添加成功");
    }
    @Test
    public void del(){
        service.del(555);
        System.out.println("删除成功");
    }
    @Test
    public void update(){
        service.update(new Student(11,"小黑黑"));
        System.out.println("更新成功");
    }
    @Test
    public void getAll(){
        List<Student> students=service.getAll();
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
