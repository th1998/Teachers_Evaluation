package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.*;
import com.teachers.Service.quotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class quotaController {
    @Autowired
    quotaService quotaservice;

    /**
     * 功能描述:添加问题
     * Param: [quotaName, percentage]
     * return: com.teachers.Model.ResultMsg
     * Author: ZT
     * Date: 2019/9/26
     */
    @RequestMapping("/addQuota")
    @ResponseBody
    public ResultMsg addQuota(String quotaName,Integer option_groupId){

        Quota quota = new Quota();
        quota.setQuotaName(quotaName);
        quota.setOption_groupId(option_groupId);
        int i =quotaservice.addQuota(quota);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
        return new ResultMsg(2,"添加失败");
    }


    @RequestMapping("selectQuota")
    @ResponseBody
    public List<Quota> selectQuota(){
        List<Quota> l = quotaservice.selectQuota();
        return l;
    }

    @RequestMapping("/quotaList")
    @ResponseBody
    public pageBean quotaList(Integer page){
        PageHelper.startPage(page, 8);
        List<Quota> quotas= quotaservice.selectQuota(page);
        int i = quotaservice.quotaSL();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setQuotaList(quotas);
        return in;
    }

    @RequestMapping("/updateQuota")
    @ResponseBody
    public ResultMsg updateQuota(Integer quotaId,String quotaName){
        int i = quotaservice.updateQuota(quotaId,quotaName);
        if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

    @RequestMapping("/delOneQuota")
    @ResponseBody
    public ResultMsg delOneQuota(Integer quotaId){
        int i = quotaservice.delOneQuota(quotaId);
            if(i>0){
            return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

    //问题选项列表
    @RequestMapping("/qo")
    @ResponseBody
    public List<Qo> qo(){
        return quotaservice.qo();
    }

    @RequestMapping("/qoList")
    @ResponseBody
    public pageBean qoList(Integer page){
        PageHelper.startPage(page, 5);
        List<Qo> l = quotaservice.qo(page);
        int i = quotaservice.quotaSL();
        System.out.println(i);
        String f = "no";
        pageBean pg = new pageBean();
        pg.setTotal(i);
        pg.setFlag(f);
        pg.setQoList(l);
        return pg;
    }


}
