package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.ResultMsg;
import com.teachers.Model.Term;
import com.teachers.Model.pageBean;
import com.teachers.Service.termService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class termController {
    @Autowired
    private termService termservice;
    /*
     *@余时南  添加学期、删除学期
     **/
    @RequestMapping("/addTerm")
    @ResponseBody
    public ResultMsg add_term(String termName,Integer termStatus){
        int i= termservice.add_term(termName,termStatus);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }
    }
    @RequestMapping("/delOneTerm")
    @ResponseBody
    public ResultMsg delOneTerm(Integer termId){
        int i = termservice.delOneTerm(termId);
        if(i>0){
            return new ResultMsg(1,"删除成功");
        }else{
            return new ResultMsg(2,"删除失败");
        }
    }

    /*
     *@唐浩  学期列表分页
     **/
    @RequestMapping("/termTotle")
    @ResponseBody
    public pageBean termTotle() {
        pageBean page = termservice.selectTerm();
        return page;
    }

    @RequestMapping("/termList")
    @ResponseBody
    public pageBean classList(Integer page){
        PageHelper.startPage(page, 8);
        List<Term> term= termservice.getTerm(page);
        int i = termservice.termTotal();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setTermList(term);
        return in;
    }

    @RequestMapping("/terms")
    @ResponseBody
    public List<Term> terms(){
        List<Term> terms= termservice.terms();
        return terms;
    }

    @RequestMapping("/updateTerm")
    @ResponseBody
    public ResultMsg updateTerm(Integer termId,String termName){
        int i = termservice.updateTerm(termId,termName);
        if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

    @RequestMapping("/updateStatus")
    @ResponseBody
    public ResultMsg updateStatus(Integer termId,Integer termStatus){
        int i = termservice.updateStatus(termId,termStatus);
        if(i>0){
            return new ResultMsg(1,"状态改变成功");
        }else{
            return new ResultMsg(1,"状态改变失败");
        }
    }
}
