package com.example.web.service.impl;

import com.example.web.mapper.CourseMapper;
import com.example.web.pojo.Course;

import com.example.web.pojo.Student;
import com.example.web.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }
//    @Override
//    public List<Course> list() {
//        return courseMapper.list();
//    }

//    @Override
//    public PageBean page(Integer page, Integer pageSize, String classname, LocalDate begin, LocalDate end) {
//        //1获取总记录数
//        Long count = classMapper.count();
//
//        //2获取分页查询结果分析
//        Integer start=(page-1)*pageSize;
//        List<course> classList = classMapper.page(start,pageSize,classname,begin,end);
//        log.info(":{}",classname);
//        //3封装PageBean对象
//        PageBean pageBean=new PageBean(count,classList);
//        return pageBean;
//        }

    @Override
    public void add(Course course) {

        courseMapper.insert(course);
    }

//    @Override
//    public void update(Classes classes) {
//        classes.setUpdateTime(LocalDateTime.now());
//
//        classMapper.update(classes);
//    }

    @Override
    public void delete(String id) {
        courseMapper.deleteById(id);
    }

    @Override
    public Course select(String id) {
        Course cla=courseMapper.select(id);
        return cla;
    }
}
