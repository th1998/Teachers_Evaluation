package com.teachers.Dao;

import com.teachers.Model.Option;
import org.apache.ibatis.annotations.*;

import java.util.List;

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


    @Select("select * from quotaoption")
    public List<Option> selectOption();
    @Select("select count(*) from quotaoption")
    public int optionSL();

    @Update("update quotaoption set optionName = #{optionName} where optionId = #{optionId}")
    public int updateOption(@Param("optionId") Integer optionId, @Param("optionName") String optionName);

    @Delete("delete from quotaoption where optionId = #{optionId}")
    public int delOption(Integer optionId);


}
