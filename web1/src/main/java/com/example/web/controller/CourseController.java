package com.example.web.controller;

import com.example.web.pojo.Course;
import com.example.web.pojo.Result;
import com.example.web.pojo.Student;
import com.example.web.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

//        @GetMapping("/clas/findAll")
//        public Result findAll(){
//            log.info("查询全部班级数据");
//            List<Classes> classesList = classService.list();
//            return Result.success(classesList);
//        }

//    @GetMapping("/clas")
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10")Integer pageSize,
//                       String classname,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
//        log.info("分页查询,参数:{},{},{},{},{}",page,pageSize,classname,begin,end);
//
//        //调用service分页查询
//        PageBean pageBean=classService.page(page,pageSize,classname,begin,end);
//        return Result.success(pageBean);
//    };

    @GetMapping("/course")
    @CrossOrigin(origins = "*")
    public Result selectAll(){
        log.info("查询全部课程信息");
        List<Course> CourseList = courseService.selectAll();

        System.out.println(CourseList.get(0).getCount());
        return Result.success(CourseList);
    }

//    @PostMapping("/course")
//    @CrossOrigin(origins = "*")
//    public Result add(@RequestBody Course course){
//        log.info("新增课程:()",course);
//
//        courseService.add(course);
//        return Result.success();
//    }

//    @PutMapping("/clas")
//    public Result update(@RequestBody Classes classes){
//        log.info("更新班级信息:{}",classes);
//        classService.update(classes);
//        return Result.success();
//    }

//    @DeleteMapping("/course/{course_id}")
//    @CrossOrigin(origins = "*")
//    public Result delete(@PathVariable String course_id){
//        log.info("根据id删除班级:{}",course_id);
//
//        courseService.delete(course_id);
//        return Result.success();
//    }
//
//    @GetMapping("/course/{course_id}")
//    @CrossOrigin(origins = "*")
//    public Result selectById(@PathVariable String course_id){
//        log.info("根据id查询");
//
//
//        Course cla = courseService.select(course_id);
//        return Result.success(cla);
//    }
}
