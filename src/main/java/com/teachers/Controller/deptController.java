package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teachers.Model.Dept;
import com.teachers.Model.ResultMsg;
import com.teachers.Model.pageBean;
import com.teachers.Service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class deptController {
    @Autowired
    private deptService deptservice;

    /*
     *@胡志航  添加院系、删除单个院系
     **/
    @RequestMapping("/addDept")
    @ResponseBody
    public ResultMsg addRole(String deptName){
        int i = deptservice.addDept(deptName);
        System.out.println("controll :"+i);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
            return new ResultMsg(2,"添加失败");

    }
    @RequestMapping("/delOneDept")
    @ResponseBody
    public ResultMsg delOneDept(Integer deptId){

        int j = deptservice.selectRoleSl(deptId);
        if(j>0){
            return new ResultMsg(2,"删除失败,该院系存在用户，不可删除！");
        }else{
            int i = deptservice.delOneDept(deptId);
            if(i>0){
                return new ResultMsg(1,"删除成功");
            }else{
                return new ResultMsg(1,"删除失败");
            }
        }

    }

    /*
     *@唐浩  院系列表分页
     **/
    @RequestMapping("/deptTotle")
    @ResponseBody
    public pageBean deptTotle() {
        pageBean page = deptservice.selectDept();
        return page;
    }
    @RequestMapping("/deptList")
    @ResponseBody
    public pageBean deptList(Integer page){
        PageHelper.startPage(page, 8);
            List<Dept> dept = deptservice.getDept(page);
            int i = deptservice.deptTotal();
            String f = "no";
            pageBean in = new pageBean();
            in.setTotal(i);
            in.setFlag(f);
            in.setDeptList(dept);
            return in;
    }

    @RequestMapping("/updateDept")
    @ResponseBody
    public ResultMsg updateDept(Integer deptId,String deptName){
        int i = deptservice.updateDept(deptId,deptName);
        if(i>0){
           return new ResultMsg(1,"修改成功");
        }else{
            return new ResultMsg(1,"修改失败");
        }
    }

    @RequestMapping("/likeFaculty")
    @ResponseBody
    public pageBean likeFaculty(String deptName){
        List<Dept> dept = deptservice.likeFaculty(deptName);
        int i = deptservice.likeFacultySL(deptName);
        String f = "yes";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setDeptList(dept);
        return in;
    }

    /*
     *@张彤  查询院系
     **/
    @RequestMapping("/findDept")
    @ResponseBody
    public List<Dept> findDept(){
        List<Dept> depts=deptservice.findDept();
        return depts;
    }
}
