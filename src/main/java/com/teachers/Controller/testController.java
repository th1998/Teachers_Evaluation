package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*
* @唐浩
* */
@Controller
public class testController {
    @Autowired
    private testService testservice;
    //批量删除院系
    @RequestMapping("/delAlla")
    @ResponseBody
    public ResultMsg delAlla(String ids) {
        System.out.println(ids);

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delAlla(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除班级
    @RequestMapping("/delClasses")
    @ResponseBody
    public ResultMsg delClasses(String ids) {
        System.out.println(ids);

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delClasses(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

    //批量删除学期
    @RequestMapping("/delTerms")
    @ResponseBody
    public ResultMsg delTerms(String ids) {
        System.out.println(ids);

        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        int i = testservice.delTerms(list);
        if(i>0) {
            return new ResultMsg(1, "删除成功！");
        }else {
            return new ResultMsg(0, "删除失败！");
        }
    }

}
