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
    /*
       @胡志航  添加院系
    */
    @RequestMapping("/addDept")
    @ResponseBody
    public ResultMsg addRole(String deptName){
        System.out.println(deptName);
        int i = deptservice.addDept(deptName);
        System.out.println("controll :"+i);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
            return new ResultMsg(2,"添加失败");

    }
    /*
        @唐浩  院系列表
    */
    @RequestMapping("/deptTotle")
    @ResponseBody
    public PageInfo<Dept> deptTotle() {
        PageInfo<Dept> page = deptservice.selectDept();
        return page;
    }
    /*
       @唐浩  院系列表
    */
    @RequestMapping("/deptList")
    @ResponseBody
    public PageInfo<Dept> deptList(Integer page){
        System.out.println(page);
        PageHelper.startPage(page, 8);
        List<Dept> dept = deptservice.getDept(page);
        PageInfo<Dept> in = new PageInfo<Dept>(dept);
        return in;
    }

    /*
      @张彤  院系查询
    */
    @RequestMapping("/findDept")
    @ResponseBody
    public List<Dept> findDept(){
        List<Dept> depts=deptservice.findDept();
        return depts;
    }
}
