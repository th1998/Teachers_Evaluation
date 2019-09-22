package com.teachers.Dao;

import com.teachers.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userDao {
    /*
     *@张彤  添加用户
     **/
    @Insert("insert into user(userNO,userName,userPass,userSex,roleId,deptId,classId)" +
            "values(#{userNO},#{userName},#{userPass},#{userSex},#{roleId},#{deptId},#{classId})")
    public int addUser(User user);


    @Select("select userId,userName from user u,role r " +
            "where u.roleId = r.roleId " +
            "and r.roleName = '教师'")
    public List<User> getTeacher();
}
