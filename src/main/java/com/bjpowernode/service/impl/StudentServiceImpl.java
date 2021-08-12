package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.util.SqlSessionUtil;
import com.bjpowernode.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;

/**
 * Author 北京动力节点
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);


    @Override
    public Student getAllinfo(String name) {
       Student student = studentDao.getAllinfo(name);
        return student;
    }

    @Override
    public Student getById(Student s) {

        Student s1 = studentDao.getById(s);

        return s1;
    }

    @Override
    public void save(Student s) {

        studentDao.save(s);

    }

    @Override
    public List<Student> getAll(String [] array) {

        List<Student> sList = studentDao.getAll(array);

        return sList;
    }

    @Override
    public List<Map<String, Object>> select23() {
        List<Map<String, Object>> list = studentDao.select23();
        return list;
    }

    @Override
    public List<StudentAndClassroomVo> select24() {

        return studentDao.select24();
    }

    @Override
    public List<StudentAndClassroomVo> select25(String name) {
        return studentDao.select25(name);
    }
}
