package com.teachers.Dao;

import com.teachers.Model.Option;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ZT on 2019/9/26 11:09
 */
@Mapper
public interface optionDao {
    /**
     * 功能描述:添加选项
     * Param: [option]
     * return: int
     * Author: ZT
     * Date: 2019/9/26
     */
    @Insert("insert into quotaoption (optionName,optionScore) values(#{optionName},#{optionScore})")
    public int addOption(Option option);
}
