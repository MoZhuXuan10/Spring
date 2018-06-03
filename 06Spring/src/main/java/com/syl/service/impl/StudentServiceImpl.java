package com.syl.service.impl;

import com.syl.bean.Student;
import com.syl.dao.StudentDao;
import com.syl.service.StudentService;

import java.io.Serializable;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    /**
     * 交给spring容器实例化dao层对象
     */
    private StudentDao dao;
    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    public int add(Student student) {
        return dao.add(student);
    }

    public int del(Serializable id) {
        return dao.del(id);
    }

    public int update(Student student) {
        return dao.update(student);
    }

    public List<Student> getAll() {
        return dao.getAll();
    }
}
