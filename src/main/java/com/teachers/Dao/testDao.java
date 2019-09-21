package com.teachers.Dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @唐浩
 * */
@Mapper
public interface testDao {
    public int delAlla(List<Object> list);
    public int delClasses(List<Object> list);
    public int delTerms(List<Object> list);
}
