package com.teachers.Controller;

import com.teachers.Model.Course_user;
import com.teachers.Model.ResultMsg;
import com.teachers.Model.Spj_view;
import com.teachers.Service.course_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZT on 2019/9/27 10:54
 */
@Controller
public class course_userController {
    @Autowired
    course_userService course_userService;

    @RequestMapping("/findCourse_user")
    @ResponseBody
    public List<Course_user> findCourse_user(Integer termId,Integer deptId) {
        System.out.println(termId);
        List<Course_user> list= course_userService.findCourse_user(termId,deptId);
        return list;
    }

    @RequestMapping("/findStuCourse")
    @ResponseBody
    public List<Spj_view> findStuCourse(Integer termId, Integer classId) {
        List<Spj_view> list= course_userService.findStuCourse(termId,classId);
        return list;
    }

}
