package com.teachers.Service;

import com.teachers.Dao.optionDao;
import com.teachers.Model.Option;
import com.teachers.Model.OptionGroup;
import com.teachers.Model.OptionGroup_view;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZT on 2019/9/26 11:11
 */
@Service
public class optionService {
    @Resource
    optionDao optiondao;

    public int addOption(Option option){
        return optiondao.addOption(option);
    }

    public List<Option> selectOption(){
        return optiondao.selectOption();
    }

    public List<Option> selectOption(Integer page){
        return optiondao.selectOption();
    }


    public int optionSL(){
        return optiondao.optionSL();
    }

    public int updateOption(Integer optionId,String optionName){
        return optiondao.updateOption(optionId,optionName);
    }

    public int delOption(Integer optionId){
        return optiondao.delOption(optionId);
    }
    public int delOption_group(Integer option_groupId){
        return optiondao.delOption_group(option_groupId);
    }

    public int addOptionGroup(OptionGroup og){
        return optiondao.addOptionGroup(og);
    }

    //选项组列表
    public List<OptionGroup_view> optionGroup(){
        return optiondao.optionGroup();
    }

    public List<OptionGroup_view> optionGroup(Integer page){
        return optiondao.optionGroup();
    }

    public int optionGroupSL(){
        return optiondao.optionGroupSL();
    }

    public List<OptionGroup> option_group(){
        return optiondao.option_group();
    }
}
