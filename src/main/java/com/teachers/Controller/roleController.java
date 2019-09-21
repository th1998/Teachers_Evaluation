package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Model.Role;
import com.teachers.Service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class roleController {
    @Autowired
    private roleService roleservice;
    /*
      @唐浩 添加角色
    * */
    @RequestMapping("/addRole")
    @ResponseBody
    public ResultMsg addRole(String roleName){
       // System.out.println(roleName);
        int i = roleservice.addRole(roleName);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }

    }

    //删除角色
    @RequestMapping("/delRole")
    @ResponseBody
    public ResultMsg delRole(Integer roleId){
        int i = roleservice.delRole(roleId);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }else{
            return new ResultMsg(2,"添加失败");
        }
    }
    /*
      @张彤 查询角色
    * */
    @RequestMapping("/selectRole")
    @ResponseBody
    public List<Role> selectRole(){
        List<Role> role = roleservice.selectRole();
        return role;
    }
}
