package com.teachers.Service;

import com.teachers.Dao.course_userDao;
import com.teachers.Model.Course_user;
import com.teachers.Model.Spj_view;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZT on 2019/9/27 10:53
 */
@Service
public class course_userService {
    @Resource
   course_userDao course_userDao;

    /**
     * 功能描述:  查询所登陆的老师的所属院系的所有当前学期的评价表
     * Param: [termId]
     * return: java.util.List<com.teachers.Model.Course_user>
     * Author: ZT
     * Date: 2019/9/27
     */
    public List<Course_user> findCourse_user(Integer termId,Integer deptId){
        return  course_userDao.findCourse_user(termId,deptId);
    }

    public List<Spj_view> findStuCourse(Integer termId,Integer classId){
        return course_userDao.findStuCourse(termId,classId);
    }

}
