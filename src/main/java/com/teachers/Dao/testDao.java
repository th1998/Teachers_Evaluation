package com.teachers.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface testDao {
    public int delAlla(List<Object> list);
}
