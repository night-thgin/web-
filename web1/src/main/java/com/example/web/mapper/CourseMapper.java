package com.example.web.mapper;

import com.example.web.pojo.Course;
import com.example.web.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface CourseMapper {
//    @Select("select * from class")
//    List<Course> list();

    @Select("select c.course_id,c.course_name,c.classroom_id,count(sc.student_id) as count " +
            "from course c " +
            "join studentcourse sc on c.course_id = sc.course_id " +
            "group by c.course_id")
    List<Course> selectAll();
    
//    @Select("select count(*) from class")
//    public Long count();

//    //@Select("select * from class where class_name like concat('%',#{classname},'%')")
//    List<Course> page(Integer start, Integer pageSize, String classname, LocalDate begin, LocalDate end);

    @Insert("insert into course (course_id,course_name) values(#{course_id},#{course_name})")
    void insert(Course course);

//    void update(Course course);

    @Delete("delete from course where course_id=#{course_id}")
    void deleteById(String id);

    @Select("select * from course where course_id = #{course_id}")
    Course select(String id);
}
