package com.example.web.service.impl;


import com.example.web.mapper.TeacherMapper;

import com.example.web.pojo.Teacher;
import com.example.web.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

//    @Override
//    public PageBean page(Integer page, Integer pageSize,String name, Short gender,
//                         LocalDate begin,
//                         LocalDate end) {
//        //1获取总记录数
//        Long count = teacherMapper.count();
//
//        //2获取分页查询结果分析
//        Integer start=(page-1)*pageSize;
//        List<Emp> empList = teacherMapper.page(start,pageSize,name,gender,begin,end);
//
//
//        //3封装PageBean对象
//        PageBean pageBean=new PageBean(count,empList);
//        return pageBean;
//    }

    @Override
    public void delete(String teacher_id) {
        teacherMapper.delete(teacher_id);
    }

    @Override
    public void save(Teacher teacher) {
        teacherMapper.insert(teacher);
    }

    @Override
    public Teacher getById(String teacher_id) {
        return teacherMapper.getById(teacher_id);
    }

//    @Override
//    public void update(Emp emp) {
//        emp.setUpdateTime(LocalDateTime.now());
//
//        teacherMapper.update(emp);
//    }

//    @Override
//    public Emp login(Emp emp) {
//        return teacherMapper.login(emp);
//    }
//
//    @Override
//    public List<Integer> getgenderlist() {
//        return teacherMapper.getgender();
//    }
//
//    @Override
//    public List<Integer> getjoblist() {
//        return teacherMapper.getjob();
//    }

    @Override
    public List<Teacher> list() {
        return teacherMapper.list();
    }


}
