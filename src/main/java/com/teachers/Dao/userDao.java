package com.teachers.Dao;

import com.teachers.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    /*
    * @张彤
    * */
    @Insert("insert into user(userNO,userName,userPass,userSex,roleId,deptId) " +
            "values(#{userNO},#{userName},#{userPass},#{userSex},#{roleId},#{deptId}) ")
    public int addUser(User user);
}
