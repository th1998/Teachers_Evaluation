package com.teachers.Dao;

import com.teachers.Model.Term;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface termDao {
    /*
     *@余时南  添加学期、删除学期
     **/
    @Insert("insert into term(termName,termStatus) values(#{termName},#{termStatus})")
    public int add_term(@Param("termName") String termName,@Param("termStatus") Integer termStatus);
    @Delete("delete from term where termId = #{termId}")
    public int delOneTerm(Integer termId);

    /*
     *@唐浩  学期列表分页
     **/
    @Select("select * from term")
    public List<Term> selectTerm();
    @Select("select count(*) from term")
    public int termTotal();

    @Update("update term set termName = #{termName} where termId = #{termId}")
    public int updateTerm(@Param("termId") Integer termId,@Param("termName")String termName);
    @Update("update term set termStatus = #{termStatus} where termId = #{termId}")
    public int updateStatus(@Param("termId") Integer termId,@Param("termStatus")Integer termStatus);
}
