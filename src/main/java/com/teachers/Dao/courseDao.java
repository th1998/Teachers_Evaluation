package com.teachers.Dao;

import com.teachers.Model.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface courseDao {
    @Insert("insert into course(courseName,courseType,classId,userId,termId) values(#{courseName},#{courseType},#{classId},#{userId},#{termId})")
    public int addCourse(Course course);

    @Delete("delete from course where courseId = #{courseId}")
    public int delOneCourse(Integer courseId);
}
