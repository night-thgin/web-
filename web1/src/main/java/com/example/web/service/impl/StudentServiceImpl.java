package com.example.web.service.impl;

import com.example.web.mapper.StudentMapper;


import com.example.web.pojo.Student;
import com.example.web.pojo.Studentcourse;
import com.example.web.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


//    @Override
//    public PageBean page(Integer page, Integer pageSize, String name,
//                         String stuId, Short education, Short claId) {
//            //1获取总记录数
//            Long count = studentMapper.count();
//
//            //2获取分页查询结果分析
//            Integer start=(page-1)*pageSize;
//            List<Stu> stuList = studentMapper.page(start,pageSize,name,stuId,education,claId);
//
//
//            //3封装PageBean对象
//            PageBean pageBean=new PageBean(count,stuList);
//            return pageBean;
//    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public void save(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void delete(String student_id) {
        studentMapper.delete(student_id);
    }

//    @Override
//    public void update(Stu stu) {
//        stu.setUpdateTime(LocalDateTime.now());
//
//        studentMapper.update(stu);
//    }

//    @Override
//    public void discPline(Disc disc) {
//        Integer id=disc.getId();
//        int violTime= studentMapper.getTime(id);
//        violTime=violTime+1;
//        int Score= studentMapper.getScore(id);
//        Score=Score+ disc.getScore();
//        studentMapper.disPline(id,violTime,Score);
//    }
//
//    @Override
//    public List<Integer> getgenderlist() {
//        return studentMapper.getgender();
//    }

    @Override
    public Student getById(String student_id) {
        return studentMapper.getById(student_id);
    }

    public List<Student> selectStudent(String major_id,String department_id,String college_id){
        return studentMapper.selectStudent(major_id,department_id,college_id);
    }
}
