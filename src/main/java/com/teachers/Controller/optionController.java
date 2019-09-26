package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.Class;
import com.teachers.Model.ResultMsg;
import com.teachers.Model.Option;
import com.teachers.Model.pageBean;
import com.teachers.Service.optionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ZT on 2019/9/26 11:12
 */
@Controller
public class optionController {
    @Autowired
    optionService optionservice;

    @RequestMapping("/addOption")
    @ResponseBody
    public ResultMsg addOption(String optionName, Integer optionScore){
        Option option = new Option();
        option.setOptionName(optionName);
        option.setOptionScore(optionScore);
        int i=optionservice.addOption(option);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
        return new ResultMsg(2,"添加失败");
    }

    @RequestMapping("optionTotal")
    @ResponseBody
    public List<Option> selectOption(){
        List<Option> l = optionservice.selectOption();
        return l;
    }

    @RequestMapping("/optionList")
    @ResponseBody
    public pageBean optionList(Integer page){
        PageHelper.startPage(page, 8);
        List<Option> options= optionservice.selectOption(page);
        int i = optionservice.optionSL();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setOptionList(options);
        return in;
    }

    @RequestMapping("/updateOption")
    @ResponseBody
    public ResultMsg updateOption(Integer optionId,String optionName){
        int i = optionservice.updateOption(optionId,optionName);
        if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

    @RequestMapping("/delOption")
    @ResponseBody
    public ResultMsg delOption(Integer optionId){
        int i = optionservice.delOption(optionId);
        if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }
}

