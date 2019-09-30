package com.teachers.Dao;

import com.teachers.Model.Course_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ZT on 2019/9/27 10:45
 */
@Mapper
public interface course_userDao {
    /**
     * 功能描述:  查询所登陆的老师的所属院系的所有当前学期的评价表
     * Param: [termId]
     * return: java.util.List<com.teachers.Model.Course_user>
     * Author: ZT
     * Date: 2019/9/27
     */
    @Select("Select * from course_user where termStatus=1 and termId=#{termId} and deptId=#{deptId}")
    public List<Course_user> findCourse_user(@Param("termId") Integer termId,@Param("deptId") Integer deptId);
}
