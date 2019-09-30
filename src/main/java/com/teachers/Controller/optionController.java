package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.*;
import com.teachers.Model.Class;
import com.teachers.Service.optionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    //添加选项组
    @RequestMapping("/addOptionGroup")
    @ResponseBody
    public ResultMsg addOptionGroup(HttpServletRequest request){
        String name = request.getParameter("name");

        String  a=request.getParameter("A");
        Integer A=Integer.valueOf(a);

        String  b=request.getParameter("B");
        Integer B=Integer.valueOf(b);

        String  c=request.getParameter("C");
        Integer C=Integer.valueOf(c);

        String  d=request.getParameter("D");
        Integer D=Integer.valueOf(d);
        OptionGroup opg = new OptionGroup();
        opg.setName(name);
        opg.setA(A);
        opg.setB(B);
        opg.setC(C);
        opg.setD(D);
        int i= optionservice.addOptionGroup(opg);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(1,"添加失败");
        }
    }

    //选项组列表
    @RequestMapping("/optionGroup")
    @ResponseBody
    public List<OptionGroup_view> optionGroup(){
        return optionservice.optionGroup();
    }

    @RequestMapping("/optionGroupList")
    @ResponseBody
    public pageBean optionGroupList(Integer page){
        int i = optionservice.optionGroupSL();
        String f = "no";
        List<OptionGroup_view> list=optionservice.optionGroup(page);
        pageBean pb = new pageBean();
        pb.setTotal(i);
        pb.setFlag(f);
        pb.setOg_viewList(list);
        return pb;
    }

    //查询选项组
    @RequestMapping("/option_group")
    @ResponseBody
    public List<OptionGroup> option_group(){
        return optionservice.option_group();
    }

    //删除单个选项组
    @RequestMapping("/delOption_group")
    @ResponseBody
    public ResultMsg delOption_group(Integer option_groupId){
        int i= optionservice.delOption_group(option_groupId);
        if(i>0){
            return new ResultMsg(1,"删除成功");
        }else{
            return new ResultMsg(1,"删除失败");
        }
    }
}

