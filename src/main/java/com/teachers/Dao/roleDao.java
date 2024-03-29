package com.teachers.Dao;


import com.teachers.Model.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface roleDao {
    /*
      @唐浩
    * */
    //添加角色
    @Insert("insert into role(roleName) values(#{roleName})")
    public int addRole(String roleName);

    //查询角色
    @Select("select * from role")
    public List<Role> selectRole();

    //删除角色
    @Delete("delete from role where roleId = #{roleId}")
    public int delRole(Integer roleId);
}
