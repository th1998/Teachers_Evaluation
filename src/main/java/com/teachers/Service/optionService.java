package com.teachers.Service;

import com.teachers.Dao.optionDao;
import com.teachers.Model.Option;
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

}
