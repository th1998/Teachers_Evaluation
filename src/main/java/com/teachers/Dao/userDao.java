package com.teachers.Dao;

import com.teachers.Model.User;
import com.teachers.Model.User_view;
import org.apache.ibatis.annotations.Delete;
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

    /*
     * 从视图查询所有用户
     */
    @Select("select * from alluser")
    public List<User_view> getAllUser();
    @Select("select count(*) from alluser")
    public int user_viewTotal();

    /*
     * 删除单个用户
     */
    @Delete("delete from user where userId = #{userId}")
    public int delOneUser(Integer userId);
}
