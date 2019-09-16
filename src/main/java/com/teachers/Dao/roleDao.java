package com.teachers.Dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface roleDao {
    @Insert("insert into role(roleName) values(#{roleName})")
    public int addRole(String roleName);
}
