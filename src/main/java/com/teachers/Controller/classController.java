package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Service.classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class classController {
    @Autowired
    private classService clsaaservice;

    /*
     @李胤江  添加班级
     */
    @RequestMapping("/addClass")
    @ResponseBody
    public ResultMsg addClass(String className){
        System.out.println(className);
        int i = clsaaservice.addclass(className);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }

    }
}
