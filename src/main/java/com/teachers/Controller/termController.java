package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Service.termService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class termController {
    @Autowired
    private termService termservice;

    @RequestMapping("/addTerm")
    @ResponseBody
    public ResultMsg add_term(String termName){
        int i= termservice.add_term(termName);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }


    }
}
