package com.example.web.service;



import com.example.web.pojo.Teacher;

import java.time.LocalDate;
import java.util.List;

public interface TeacherService {
//    PageBean page(Integer page,Integer pageSize,
//                  String name, Short gender,
//                  LocalDate begin,
//                  LocalDate end);
//批量删除
    void delete(String teacher_id);
//新增员工
    void save(Teacher teacher);
//根据id查询员工
    Teacher getById(String teacher_id);
//更新员工
//    void update(Emp emp);

//    Emp login(Emp emp);

//    List<Integer> getgenderlist();
//
//    List<Integer> getjoblist();

    List<Teacher> list();
}
