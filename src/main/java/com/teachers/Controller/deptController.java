package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class deptController {
    @Autowired
    private deptService deptservice;

    @RequestMapping("/addDept")
    @ResponseBody
    public ResultMsg addRole(String deptName){
        System.out.println(deptName);
        int i = deptservice.addDept(deptName);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }

    }

}
