package com.teachers.Controller;

import com.github.pagehelper.PageHelper;

import com.teachers.Model.ResultMsg;
import com.teachers.Model.Class;
import com.teachers.Model.pageBean;
import com.teachers.Service.classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class classController {
    @Autowired
    private classService classservice;

    /*
     *@李胤江  添加班级、删除班级
     **/
    @RequestMapping("/addClass")
    @ResponseBody
    public ResultMsg addClass(String className){
        System.out.println(className);
        int i = classservice.addclass(className);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }
    }
    @RequestMapping("/delOneClass")
    @ResponseBody
    public ResultMsg delOneClass(Integer classId){
        int i = classservice.delOneClass(classId);
        if(i>0){
            return new ResultMsg(1,"删除成功");
        }else{
            return new ResultMsg(2,"删除失败");
        }
    }

    /*
     *@张彤 查询班级
     **/
    @RequestMapping("/findClass")
    @ResponseBody
    public List<Class> findClass(){
        List<Class> classes = classservice.findClass();
        return classes;
    }

    /*
     *@唐浩  班级列表分页
     **/
    @RequestMapping("/classTotle")
    @ResponseBody
    public pageBean classTotle() {
        pageBean page = classservice.selectDept();
        return page;
    }

    @RequestMapping("/classList")
    @ResponseBody
    public pageBean classList(Integer page){
        PageHelper.startPage(page, 8);
        List<Class> classes= classservice.getClass(page);
        int i = classservice.classTotal();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setClassList(classes);
        return in;
    }


}
