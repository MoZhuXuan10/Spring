package com.syl.bean;

public class Student {
    private Integer sId;
    private String sName;

    public Student() {
    }

    public Student(Integer sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                '}';
    }
}
