package com.teachers.Dao;

import com.teachers.Model.Term;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface termDao {
    /*
     *@余时南  添加学期、删除学期
     **/
    @Insert("insert into term(termName) values(#{termName})")
    public int add_term(String termName);
    @Delete("delete from term where termId = #{termId}")
    public int delOneTerm(Integer termId);

    /*
     *@唐浩  学期列表分页
     **/
    @Select("select * from term")
    public List<Term> selectTerm();
    @Select("select count(*) from term")
    public int termTotal();
}
