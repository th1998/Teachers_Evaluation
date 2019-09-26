package com.teachers.Dao;

import com.teachers.Model.Course;
import com.teachers.Model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    public int delOptions(List<Object> list);
    public int delQuotas(List<Object> list);
    public List<Course> findOneCourse(Integer courseId);
    public int delUsers(List<Object> list);
    public List<Course> selectCourse();
    public int courseTotal();

    public List<Dept> likeFaculty(@Param("deptName") String deptName);
    public int likeFacultySL(@Param("deptName") String deptName);

    public int selectRoleSl(Integer deptId);
}
