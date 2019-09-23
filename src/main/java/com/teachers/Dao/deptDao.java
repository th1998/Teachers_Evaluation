package com.teachers.Dao;

import com.teachers.Model.Dept;
import com.teachers.Utl.sqlUtl;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface deptDao {
    /*
     *@胡志航  添加院系、删除单个院系
     **/
    @Insert("insert into department(deptName) values(#{deptName})")
    public int addDept(String deptName);

    @Delete("delete from department where deptId = #{deptId}")
    public int delOneDept(Integer deptId);

    /*
     *@唐浩  院系列表分页
     **/
    @Select("select * from department")
    public List<Dept> selectDept();
    @Select("select count(*) from department")
    public int deptTotal();

    @Update("update department set deptName = #{deptName} where deptId = #{deptId}")
    public int updateDept(@Param("deptId") Integer deptId,@Param("deptName") String deptName);

    /*
     *@张彤  查询院系
     **/
    @Select("select * from department")
    public List<Dept> findDept();


}
