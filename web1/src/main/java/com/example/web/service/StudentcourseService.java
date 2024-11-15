package com.example.web.service;
import com.example.web.pojo.Studentcourse;
import com.example.web.pojo.Studentcoursename;
import java.util.List;

public interface StudentcourseService {
    List<Studentcoursename> selectAll();

    List<Studentcoursename> selectbyCourse(String course_id);

    List<Studentcoursename> selectbyStudent(String student_id);

    void delete(Integer id);
//
    Integer add(Studentcourse studentcourse);
//
//    void update(Studentcourse dept);
}
