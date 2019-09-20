package com.teachers.Dao;

import com.teachers.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    /*
    * @张彤
    * */
    @Insert("insert into user(userNO,userName,userPass,userSex,roleId,deptId,classId)" +
            "values(#{userNO},#{userName},#{userPass},#{userSex},#{roleId},#{deptId},#{classId})")
    public int addUser(User user);

}
