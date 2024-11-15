package com.example.web.mapper;


import com.example.web.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface TeacherMapper {

//    @Select("select count(*) from emp")//查询总记录数
//    public Long count();

//   // @Select("select * from emp limit #{start},#{pageSize}")//分页查询，获取列表数据
//    public List<Emp> page(Integer start, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end);

    //批量删除

    @Delete("delete from teacher where teacher_id=#{teacher_id}")
    void delete(String teacher_id);

    //新增员工
    @Insert("insert into teacher(teacher_id,teacher_name,manger_college)"+
             "values(#{teacher_id},#{teacher_name},#{manger_college})")
    void insert(Teacher teacher);

    //根据id查询员工
    @Select("select * from teacher where teacher_id = #{teacher_id}")
    Teacher getById(String teacher_id);

//    //更新员工
//    void update(Emp emp);

//    @Select("select * from emp where username =#{username} and password = #{password}")
//    Emp login(Emp emp);


//    List<Integer> getgender();
//
//    List<Integer> getjob();

    @Select("select * from teacher")
    List<Teacher> list();
}
