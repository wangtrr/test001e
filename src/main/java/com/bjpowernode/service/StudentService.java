package com.bjpowernode.service;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;

/**
 * Author 北京动力节点
 */
public interface StudentService {
    Student getAllinfo(String name);
    public Student getById(Student s);
    public void save(Student s);
    List<Student> getAll(String[] array);
    List<Map<String, Object>> select23();

    List<StudentAndClassroomVo> select24();

    List<StudentAndClassroomVo> select25(String name);
}
