package com.teachers.Dao;

import com.teachers.Model.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @唐浩
 * */
@Mapper
public interface testDao {
    public int delAlla(List<Object> list);
    public int delClasses(List<Object> list);
    public int delTerms(List<Object> list);
    public int delCourses(List<Object> list);
    public List<Course> findOneCourse(Integer courseId);
    public int delUsers(List<Object> list);
    public List<Course> selectCourse();
    public int courseTotal();
}
