package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.Course;
import com.teachers.Model.ResultMsg;
import com.teachers.Model.pageBean;
import com.teachers.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*
* @唐浩
* */
@Controller
public class testController {
    @Autowired
    private testService testservice;
    //批量删除院系
    @RequestMapping("/delAlla")
    @ResponseBody
    public ResultMsg delAlla(String ids) {

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delAlla(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除班级
    @RequestMapping("/delClasses")
    @ResponseBody
    public ResultMsg delClasses(String ids) {


        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delClasses(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除学期
    @RequestMapping("/delTerms")
    @ResponseBody
    public ResultMsg delTerms(String ids) {

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delTerms(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除课程
    @RequestMapping("/delCourses")
    @ResponseBody
    public ResultMsg delCourses(String ids) {

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delCourses(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除课程
    @RequestMapping("/delUsers")
    @ResponseBody
    public ResultMsg delUsers(String ids) {

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delUsers(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //查询单个课程
    @RequestMapping("/findOneCourse")
    @ResponseBody
    public List<Course> findOneCourse(Integer courseId){
        List<Course> c = testservice.findOneCourse(courseId);
        return c;
    }

    //课程列表
    @RequestMapping("/courseTotle")
    @ResponseBody
    public pageBean courseTotle() {
        pageBean page = testservice.selectCourse();
        return page;
    }

    @RequestMapping("/courseList")
    @ResponseBody
    public pageBean classList(Integer page){
        PageHelper.startPage(page, 8);
        List<Course> courses= testservice.getCourse(page);
        int i = testservice.courseTotal();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setCourseList(courses);
        return in;
    }

}
