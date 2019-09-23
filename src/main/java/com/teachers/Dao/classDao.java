package com.teachers.Dao;

import com.teachers.Model.Class;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface classDao {
    /*
     *@李胤江  添加班级、删除班级
     **/
    @Insert("insert into class(classname) values(#{className})")
    public  int addClass(String className);
    @Delete("delete from class where classId = #{classId}")
    public int delOneClass(Integer classId);

    /*
     *@张彤  查询班级
     **/
    @Select("select * from class")
    public List<Class> findClass();

    /*
     *@唐浩  班级列表分页
     **/
    @Select("select * from class")
    public List<Class> selectClass();
    @Select("select count(*) from class")
    public int classTotal();

    @Update("update class set className = #{className} where classId = #{classId}")
    public int updateClass(@Param("classId") Integer classId,@Param("className") String className);


}
