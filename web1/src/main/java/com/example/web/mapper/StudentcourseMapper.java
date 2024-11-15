package com.example.web.mapper;

import com.example.web.pojo.Studentcourse;
import com.example.web.pojo.Studentcoursename;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentcourseMapper {
    @Select("SELECT studentcourse.id ,student.student_name ,student.sex ,course.course_name ,course.classroom_id " +
            "FROM studentcourse JOIN student ON studentcourse.student_id = student.student_id " +
            "JOIN course ON studentcourse.course_id = course.course_id ")
    List<Studentcoursename> selectAll();

    @Select("SELECT studentcourse.id ,student.student_name ,student.sex ,course.course_name ,course.classroom_id " +
            "FROM studentcourse JOIN student ON studentcourse.student_id = student.student_id " +
            "JOIN course ON studentcourse.course_id = course.course_id " +
            "WHERE studentcourse.course_id = #{course_id}")
    List<Studentcoursename> selectbyCourse(String course_id);

    @Select("SELECT studentcourse.id, student.student_name, student.sex, course.course_name, course.classroom_id " +
            "FROM studentcourse JOIN student ON studentcourse.student_id = student.student_id " +
            "JOIN course ON studentcourse.course_id = course.course_id " +
            "WHERE studentcourse.student_id = #{student_id}")
    List<Studentcoursename> selectbyStudent(String student_id);

    @Delete("delete from studentcourse where id=#{id}")
    void deleteById(Integer id);

    @Select("select student_id from student where student_id = #{student_id}")
    String select(Studentcourse studentcourse);

    @Insert("insert into studentcourse (id,student_id,course_id) values(#{id},#{student_id},#{course_id})")
    void insert(Studentcourse studentcourse);
//
//    @Update("update dept set name = #{name} where id = #{id}")
//    void update(Studentcourse dept);
}
