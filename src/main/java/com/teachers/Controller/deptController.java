package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teachers.Model.Dept;
import com.teachers.Model.ResultMsg;
import com.teachers.Service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("/deptTotle")
    @ResponseBody
    public PageInfo<Dept> deptTotle() {
        PageInfo<Dept> page = deptservice.selectDept();
        return page;
    }

    @RequestMapping("/deptList")
    @ResponseBody
    public PageInfo<Dept> deptList(Integer page){
        System.out.println(page);
        PageHelper.startPage(page, 8);
        List<Dept> dept = deptservice.getDept(page);
        PageInfo<Dept> in = new PageInfo<Dept>(dept);
        return in;
    }

}
