package com.teachers.Dao;

import com.teachers.Model.pj_view;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ZT on 2019/9/29 10:19
 * 内容描述：所有评教对象视图
 */
@Mapper
public interface pj_viewDao {
    @Select("SELECT * from pj_view where termStatus=1")
    public List<pj_view> pjTeacher();

    @Select("SELECT count(*) from pj_view where termStatus=1")
    public int pjCount();

}
