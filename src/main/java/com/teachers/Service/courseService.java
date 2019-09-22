package com.teachers.Service;

import com.teachers.Dao.courseDao;
import com.teachers.Model.Course;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class courseService {
    @Resource
    courseDao coursedao;

    public int addCourse(Course course){
        return coursedao.addCourse(course);
    }

    /*
     *@唐浩  班级列表分页
     **/
    public pageBean selectCourse(){
        int t = coursedao.courseTotal();
        List<Course> a= coursedao.selectCourse();
        String f = "no";
        pageBean page = new pageBean();
        page.setFlag(f);
        page.setTotal(t);
        page.setCourseList(a);
        return page;
    }
    public List<Course> getCourse(Integer page){
        List<Course> a= coursedao.selectCourse();
        return a;
    }
    public int courseTotal(){
        return coursedao.courseTotal();
    }
}
