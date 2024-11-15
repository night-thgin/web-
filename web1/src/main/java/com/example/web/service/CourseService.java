package com.example.web.service;

import com.example.web.pojo.Course;
//import com.example.web.pojo.PageBean;
import com.example.web.pojo.Student;

import java.time.LocalDate;
import java.util.List;

public interface CourseService {
    //<Course> list();

    //PageBean page(Integer page, Integer pageSize, String classname, LocalDate begin, LocalDate end);

    List<Course> selectAll();

    void add(Course course);

    //void update(Classes classes);

    void delete(String id);

    Course select(String id);
}
