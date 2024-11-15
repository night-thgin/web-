package com.example.web.mapper;


import com.example.web.pojo.Student;
import com.example.web.pojo.Studentcourse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
//    @Select("select count(*) from stu")
//    Long count();
//
//    public List<Stu> page(Integer start, Integer pageSize, String name, String stuId, Short education, Short claId);

    @Select("select * from student")
    List<Student> selectAll();

    @Insert("insert into student(student_id,student_name,sex,college_id,major_id)"+
            "values(#{student_id},#{student_name},#{sex},#{college_id},#{major_id})")
    void insert(Student student);

    @Delete("delete from student where student_id=#{student_id}")
    void delete(String student_id);


    //void update(Stu stu);

//    @Insert("update stu set violTimes= #{violTime},violScore=#{Score} where id=#{id}" )
//    void disPline(Integer id,int violTime,int Score);

//    @Select("select violTimes from stu where id = #{id}")
//    int getTime(Integer id);
//    @Select("select violScore from stu where id = #{id}")
//    int getScore(Integer id);


    //List<Integer> getgender();

    @Select("select * from student where student_id = #{student_id}")
    Student getById(String student_id);

//    @Select("select * from student where major_id = #{major_id} and major_id = " +
//            "(select major_id from major where department_id = #{department_id} and department_id = " +
//            "(select department_id from department where college_id = #{college_id}))")
//    Student selectStudent(String major_id,String department_id,String college_id);
@Select({
        "<script>",
        "SELECT * FROM student",
        "WHERE 1=1", // 这是一个常用的技巧，用于确保即使所有条件都被忽略，WHERE子句也是有效的
        "<if test='department_id != null '>",
        "  AND EXISTS (",
        "    SELECT 1 FROM major",
        "    WHERE major.major_id = student.major_id", // 确保与student表的major_id字段关联
        "      AND major.department_id = #{department_id}",
        "      <if test='college_id != null'>",
        "        AND EXISTS (",
        "          SELECT 1 FROM department",
        "          WHERE department.department_id = major.department_id",
        "            AND department.college_id = #{college_id}",
        "        )",
        "      </if>",
        "  )",
        "</if>",
        "<if test='college_id != null'>",
        "  AND college_id = #{college_id}",
        "</if>",
        "<if test='major_id != null'>",
        "  AND major_id = #{major_id}",
        "</if>",
        "</script>"


})
List<Student> selectStudent(String major_id, String department_id, String college_id);

}
