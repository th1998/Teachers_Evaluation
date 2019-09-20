package com.teachers.Dao;

import com.teachers.Model.Dept;
import com.teachers.Utl.sqlUtl;
import org.apache.ibatis.annotations.*;

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
    @Select("select count(*) from department")
    public int deptTotal();
    @Select("select * from department where CONCAT(deptName) like '%' || '${deptName}' || '%'")
    //@SelectProvider(method = "select", type = sqlUtl.class)
    public List<Dept> findOneDept(@Param("deptName") String deptName);

    @Select("select count(*) from department where deptName like '%${deptName}%'")
    public int deptSL(String deptName);

    @Delete("delete from department where deptId = #{deptId}")
    public int delOneDept(Integer deptId);


    /*
      @张彤
    */
    @Select("select * from department")
    public List<Dept> findDept();


}
