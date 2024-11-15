package com.example.web.service;


import com.example.web.pojo.Student;
import com.example.web.pojo.Studentcourse;

import java.util.List;

public interface StudentService {
    //分页查询
//    PageBean page(Integer page, Integer pageSize, String name,
//                  String stuId, Short education, Short claId);
//新增学员

    List<Student> selectAll();

    void save(Student student);

    void delete(String student_id);

    //void update(Stu stu);

    //void discPline(Disc disc);

    //List<Integer> getgenderlist();

    Student getById(String student_id);

    List<Student> selectStudent(String major_id,String department_id,String college_id);
}
