package com.teachers.Dao;

import com.teachers.Model.Comment;
import com.teachers.Model.Course_score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentDao {
    //评价成绩添加
    @Insert("insert into comment(teacherId,courseId,userId,termId,score) values(#{teacherId},#{courseId},#{userId},#{termId},#{score})")
    public  int addComment(Comment comment);

    //教师查看成绩
    @Select("select * from course_score where userId = #{userId} and termId = #{termId}")
    public List<Course_score> selectScore(@Param("userId") Integer userId,@Param("termId") Integer termId);
}
