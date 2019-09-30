package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.pageBean;
import com.teachers.Model.pj_view;
import com.teachers.Service.pj_viewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ZT on 2019/9/29 10:23
 * 内容描述：所有评教对象视图
 */
@Controller
public class pj_viewController {
    @Autowired
    pj_viewService pjViewService;

    @RequestMapping("/teacher")
    @ResponseBody
    public pageBean pjTeacher() {
        int i = pjViewService.pjCount();
        String f="no";
        List<pj_view> list=pjViewService.pjTeacher();
        pageBean pagebean = new pageBean();
        pagebean.setTotal(i);
        pagebean.setFlag(f);
        pagebean.setPj_viewList(list);
        return pagebean;
    }
    @RequestMapping("/pjTeacherList")
    @ResponseBody
    public pageBean pjTeacher(Integer page) {
        PageHelper.startPage(page, 8);
        int i = pjViewService.pjCount();
        String f="no";
        List<pj_view> list=pjViewService.pjTeacher(page);
        pageBean pagebean = new pageBean();
        pagebean.setTotal(i);
        pagebean.setFlag(f);
        pagebean.setPj_viewList(list);
        return pagebean;
    }

    @RequestMapping("/pjCount")
    @ResponseBody
    public int pjCount(){
        return pjViewService.pjCount();
    }
    }
