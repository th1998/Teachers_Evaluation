package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {
    @Autowired
    private testService testservice;
    //批量删除
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
}
