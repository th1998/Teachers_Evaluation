package com.teachers.Controller;

import com.teachers.Model.Quota;
import com.teachers.Model.ResultMsg;
import com.teachers.Service.quotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class quotaController {
    @Autowired
    quotaService quotasrvice;

    /**
     * 功能描述:添加问题
     * Param: [quotaName, percentage]
     * return: com.teachers.Model.ResultMsg
     * Author: ZT
     * Date: 2019/9/26
     */
    @RequestMapping("/addQuota")
    @ResponseBody
    public ResultMsg addQuota(String quotaName, Double percentage){
        //System.out.println("quotaname: "+quotaName+"percentage: "+percentage);
        Quota quota = new Quota();
        quota.setQuotaName(quotaName);
        quota.setPercentage(percentage);
        int i =quotasrvice.addQuota(quota);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
        return new ResultMsg(2,"添加失败");
    }
}
