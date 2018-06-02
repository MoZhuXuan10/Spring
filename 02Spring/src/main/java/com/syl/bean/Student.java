package com.syl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 学生的实体类
 *
 * Aware本意就是察觉，感觉
 * 01.实现了BeanNameAware，就是让student类感觉到自己在容器中的id或者是name
 * 02.实现了BeanFactoryAware，就是让student类感觉到自己在容器中所属的bean工厂
 * 03.实现了InitializingBean，就是为了执行初始化之后的操作 ,但是对spring产生了依赖
 *         后续使用反射机制 init-method 来消除对spring的依赖
 * 04.实现了DisposableBean，就是为了执行bean销毁之后的操作 ,但是对spring产生了依赖
 *         后续使用反射机制 destroy-method 来消除对spring的依赖
 */
public class Student implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
    public Student() {
        System.out.println("===Student类中的无参构造===");
    }
    private int age;//年龄
    private String stuName;//姓名
    /**
     * bean在容器中的id或者name
     */
    private String beanName;
    /**
     * bean所在的工厂
     */
    private BeanFactory beanFactory;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("===Student类中给属性赋值 setAge()===");
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        System.out.println("===Student类中给属性赋值 setStuName()===");
        this.stuName = stuName;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }


    /**
     * BeanFactoryAware中的setBeanFactory（）
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("===执行了BeanFactoryAware中的setBeanFactory（）===");
        this.beanFactory=beanFactory;
    }

    /**
     * BeanNameAware接口中的setBeanName（）
     * @param beanName
     */
    @Override
    public void setBeanName(String beanName) {
        System.out.println("===执行了BeanNameAware接口中的setBeanName（）===");
        this.beanName=beanName;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===DisposableBean中的destroy()===");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===InitializingBean中的afterPropertiesSet()===");
    }
    public void initMethod(){
        System.out.println("===Student类中的initMethod（）===");
    }
    public  void myDestroy(){
        System.out.println("===Student类中的myDestroy（）===");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
