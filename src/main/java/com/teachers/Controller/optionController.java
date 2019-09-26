package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Model.Option;
import com.teachers.Service.optionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZT on 2019/9/26 11:12
 */
@Controller
public class optionController {
    @Autowired
    optionService optionService;

    @RequestMapping("/addOption")
    @ResponseBody
    public ResultMsg addOption(String optionName, Integer optionScore){
        Option option = new Option();
        option.setOptionName(optionName);
        option.setOptionScore(optionScore);
        int i=optionService.addOption(option);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
        return new ResultMsg(2,"添加失败");
    }
    }

