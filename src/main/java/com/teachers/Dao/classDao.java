package com.teachers.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface classDao {
    @Insert("insert into class(classname) values(#{className})")
    public  int addClass(String className);
}