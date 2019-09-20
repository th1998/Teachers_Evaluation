package com.teachers.Dao;

import com.teachers.Model.Class;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface classDao {
    /*
    @李胤江
     */
    @Insert("insert into class(classname) values(#{className})")
    public  int addClass(String className);

    @Select("select * from class")
    public List<Class> findClass();
}
