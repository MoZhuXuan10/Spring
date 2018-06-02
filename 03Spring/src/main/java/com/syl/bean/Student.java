package com.syl.bean;

import java.util.*;

/**
 * 学生的实体类
 */
public class Student {
    private String name;
    private Grade grade;//学生对应的年级
    private List<String> list=new ArrayList<>();
    private Set<String> set=new HashSet<>();
    private Map map=new HashMap();
    private String [] names=new String[2];
    private Properties properties=new Properties();

    public Student() {
        System.out.println("student=============无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
