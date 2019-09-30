package com.teachers.Dao;

import com.teachers.Model.Option;
import com.teachers.Model.OptionGroup;
import com.teachers.Model.OptionGroup_view;
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

    @Delete("delete from option_group where option_groupId = #{option_groupId}")
    public int delOption_group(Integer option_groupId);

    @Insert("insert into option_group(name,A,B,C,D) values(#{name},#{A},#{B},#{C},#{D})")
    public int addOptionGroup(OptionGroup og);

    @Select("select * from optionGroup")
    public List<OptionGroup_view> optionGroup();
    @Select("select count(*) from optionGroup")
    public int optionGroupSL();

    @Select("select * from option_group")
    public List<OptionGroup> option_group();

}
