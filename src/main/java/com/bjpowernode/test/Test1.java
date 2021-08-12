package com.bjpowernode.test;

import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;
import com.bjpowernode.vo.StudentAndClassroomVo;

import java.util.List;

/**
 * Author 北京动力节点
 */
public class  Test1 {

    public static void main(String[] args) {

        //StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        List<StudentAndClassroomVo> list = ss.select25("张");
        for (StudentAndClassroomVo stu: list
             ) {
            System.out.println(stu);
        }
        //测试添加操作
        /*Student s = new Student();
        s.setId("A0006");
        s.setName("cxk");
        s.setAge(23);
        ss.save(s);*/

        //测试根据id查单条操作



        //查询所有记录
//        List<Student> sList = ss.getAll();
//        for(Student s:sList){
//
//            System.out.println(s);
//
//        }


    }

}






























