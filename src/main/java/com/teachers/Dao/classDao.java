package com.teachers.Dao;

import com.teachers.Model.Class;
import org.apache.ibatis.annotations.Delete;
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

    /*
    * @张彤
    * */
    @Select("select * from class")
    public List<Class> findClass();

    /*
    * @唐浩
    * */
    @Select("select * from class")
    public List<Class> selectClass();
    @Select("select count(*) from class")
    public int classTotal();

    @Delete("delete from class where classId = #{classId}")
    public int delOneClass(Integer classId);
}
