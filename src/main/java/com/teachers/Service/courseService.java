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

    public int delOneCourse(Integer courseId){
        return coursedao.delOneCourse(courseId);
    }

    public int updateCourse(Course course){
        return coursedao.updateCourse(course);
    }
}
