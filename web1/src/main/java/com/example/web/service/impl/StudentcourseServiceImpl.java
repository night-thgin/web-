package com.example.web.service.impl;

import com.example.web.mapper.StudentcourseMapper;
import com.example.web.pojo.Studentcourse;
import com.example.web.pojo.Studentcoursename;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;
import com.example.web.service.StudentcourseService;

import java.security.PublicKey;
import java.util.List;

@Service
public class StudentcourseServiceImpl implements StudentcourseService {

    @Autowired
    private StudentcourseMapper studentcourseMapper;

    @Override
    public List<Studentcourse> selectAll() {
        return studentcourseMapper.selectAll();
    }

    public List<Studentcoursename> selectbyCourse(String course_id){
        return studentcourseMapper.selectbyCourse(course_id);
    }

    public List<Studentcoursename> selectbyStudent(String student_id){
        return studentcourseMapper.selectbyStudent(student_id);
    }

    @Override
    public void delete(Integer id) {
        studentcourseMapper.deleteById(id);
    }
//
    @Override
    public Integer add(Studentcourse studentcourse) {


        System.out.println(studentcourseMapper.select(studentcourse));
        if(studentcourseMapper.select(studentcourse) != ""){

            studentcourseMapper.insert(studentcourse);
            return 1;
        }
        else{

            return 0;
        }
    }
//
//    @Override
//    public void update(Dept dept) {
//        dept.setUpdateTime(LocalDateTime.now());
//        deptMapper.update(dept);



}
