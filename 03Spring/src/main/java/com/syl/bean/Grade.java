package com.syl.bean;

import java.io.Serializable;

/**
 * 年级的实体类
 */
public class Grade implements Serializable{
    private  int  id;  //年级编号
    private  String  gradeName;  // 年级名称

    public Grade() {
        System.out.println("grade=============无参构造");
    }

    public Grade(int id, String gradeName) {
        this.id = id;
        this.gradeName = gradeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
