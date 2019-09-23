package com.teachers.Service;

import com.teachers.Dao.testDao;

import com.teachers.Model.Course;
import com.teachers.Model.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @唐浩
 * */
@Service
public class testService {
    @Resource
    testDao testdao;

    public int delAlla(List<Object> list){
        return testdao.delAlla(list);
    }
    public int delClasses(List<Object> list){
        return testdao.delClasses(list);
    }
    public int delTerms(List<Object> list){
        return testdao.delTerms(list);
    }
    public int delCourses(List<Object> list){ return  testdao.delCourses(list);}
    public int delUsers(List<Object> list){ return  testdao.delUsers(list);}

    public pageBean selectCourse(){
        int t = testdao.courseTotal();
        List<Course> a= testdao.selectCourse();
        String f = "no";
        pageBean page = new pageBean();
        page.setFlag(f);
        page.setTotal(t);
        page.setCourseList(a);
        return page;
    }
    public List<Course> getCourse(Integer page){
        List<Course> a= testdao.selectCourse();
        return a;
    }
    public int courseTotal(){
        return testdao.courseTotal();
    }
}
