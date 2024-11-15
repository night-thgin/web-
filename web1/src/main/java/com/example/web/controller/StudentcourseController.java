package com.example.web.controller;

import com.example.web.pojo.Studentcourse;
import com.example.web.pojo.Studentcoursename;
import com.example.web.service.StudentcourseService;
import com.example.web.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class StudentcourseController {

    //private static Logger log= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private StudentcourseService studentcourseService;

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/sc")
    @CrossOrigin(origins = "*")
    public Result selectAll(){
        log.info("查询全部选课数据");

        List<Studentcoursename> StudentcourseList = studentcourseService.selectAll();

        return Result.success(StudentcourseList);
    }

    @GetMapping("/scc")
    @CrossOrigin(origins = "*")
    public Result selectbyCourse(String course_id){
        log.info("根据课程查询学生选课数据");

        List<Studentcoursename> StudentcourseList = studentcourseService.selectbyCourse(course_id);

        return Result.success(StudentcourseList);
    }

    @GetMapping("/scs")
    @CrossOrigin(origins = "*")
    public Result selectbyStudent(String student_id){
        log.info("根据学生查询课程选课数据");

        List<Studentcoursename> StudentcourseList = studentcourseService.selectbyStudent(student_id);

        return Result.success(StudentcourseList);
    }

    @DeleteMapping("/sc/{id}")
    @CrossOrigin(origins = "*")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除选课信息");

        studentcourseService.delete(id);
        return Result.success();
    }

    @PostMapping("/sc")
    @CrossOrigin(origins = "*")
    public Result add(@RequestBody Studentcourse studentcourse){
        log.info("新增选课信息");

        int i = studentcourseService.add(studentcourse);

        if (i == 0){
            return Result.error();
        }else{
            return Result.success();
        }
    }

//    @PutMapping("/depts")
//    public Result update(@RequestBody Dept dept){
//        log.info("修改部门");
//        deptService.update(dept);
//        return Result.success();
//
//    }

}
