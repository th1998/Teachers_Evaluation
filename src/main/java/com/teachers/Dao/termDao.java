package com.teachers.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface termDao {
    @Insert("insert into term(termName) values(#{termName})")
    public int add_term(String termName);

}
