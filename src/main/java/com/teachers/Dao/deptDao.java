package com.teachers.Dao;

import com.teachers.Model.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface deptDao {
    /*
      @胡志航
     */
    @Insert("insert into department(deptName) values(#{deptName})")
    public int addDept(String deptName);
    /*
      @唐浩
    */
    @Select("select * from department")
    public List<Dept> selectDept();

    /*
      @张彤
    */
    @Select("select * from department")
    public List<Dept> findDept();
}
