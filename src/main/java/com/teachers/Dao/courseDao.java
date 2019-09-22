package com.teachers.Dao;

import com.teachers.Model.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface courseDao {
    @Insert("insert into course(courseName,courseType,classId,userId,termId) values(#{courseName},#{courseType},#{classId},#{userId},#{termId})")
    public int addCourse(Course course);

    /*
     *@唐浩  课程列表分页
     **/
    @Select("select * \n" +
            "from course co,class cl,user us,term te\n" +
            "where cl.classId = co.classId\n" +
            "and us.userId = co.userId\n" +
            "and te.termId = co.termId")

    public List<Course> selectCourse();
    @Select("select count(*) from course")
    public int courseTotal();
}
