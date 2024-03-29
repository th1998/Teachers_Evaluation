package com.teachers.Controller;


import com.teachers.Model.Course;
import com.teachers.Model.ResultMsg;

import com.teachers.Service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class courseController {
    @Autowired
    private courseService courseservice;

    @RequestMapping("/addCourse")
    @ResponseBody
    public ResultMsg addCourse(Course course){
        Course c = new Course();
        c.setCourseId(course.getCourseId());
        c.setCourseName(course.getCourseName());
        c.setCourseType(course.getCourseType());
        c.setClassId(course.getClassId());
        c.setUserId(course.getUserId());
        c.setTermId(course.getTermId());
        int i = courseservice.addCourse(c);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(1,"添加失败");
        }
    }

    @RequestMapping("/delOneCourse")
    @ResponseBody
    public ResultMsg delOneCourse(Integer courseId){
        int i = courseservice.delOneCourse(courseId);
        if(i>0){
            return new ResultMsg(1,"删除成功");
        }else{
            return new ResultMsg(1,"删除失败");
        }
    }

    @RequestMapping("/updateCourse")
    @ResponseBody
    public ResultMsg updateCourse(Course course){
        Course co = new Course();
        co.setCourseId(course.getCourseId());
        co.setCourseName(course.getCourseName());
        co.setCourseType(course.getCourseType());
        co.setClassId(course.getClassId());
        co.setUserId(course.getUserId());
        co.setTermId(course.getTermId());
        int i = courseservice.updateCourse(co);
        if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

}
