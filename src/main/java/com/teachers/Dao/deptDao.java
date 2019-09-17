package com.teachers.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface deptDao {
    @Insert("insert into department(deptName) values(#{deptName})")
    public int addDept(String deptName);
}
