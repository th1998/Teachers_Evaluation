package com.teachers.Controller;

import com.github.pagehelper.PageHelper;
import com.teachers.Model.*;
import com.teachers.Model.Class;
import com.teachers.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class userController {
    @Autowired
    userService userservice;

    /*
     *@张彤  添加用户
     **/
    @RequestMapping("/addUser")
    @ResponseBody
    public ResultMsg addUser(HttpServletRequest request) {
        String no=request.getParameter("userNO");
        String name= request.getParameter("userName");
        String pass=no;
        String  sex=request.getParameter("userSex");
        Integer usersex=Integer.valueOf(sex);
        String role=request.getParameter("roleId");
        Integer roleId=Integer.valueOf(role);

        String classes=request.getParameter("classId");
        /*
         * 判断班级是否为空，如果为空则存在为-1
         **/
        if(classes.equals(" ")){
            classes = "-1";
        }
        Integer classId=Integer.valueOf(classes); //转换为integer类型

        /*
         * 判断院系是否为空，如果为空则存在为-1
         **/
        String dept=request.getParameter("deptId");
        if(dept.equals(" ")){
            dept = "-1";
        }
        Integer deptId=Integer.valueOf(dept);

        //实例化一个user
        User user = new User();
        user.setUserNO(no);
        user.setUserName(name);
        user.setUserPass(pass);
        user.setUserSex(usersex);
        user.setRoleId(roleId);
        user.setDeptId(deptId);
        user.setClassId(classId);
        //开始添加用户添加
        int i= userservice.addUser(user);
        if(i>0){
            return new ResultMsg(1,"添加成功");
        }
        return new ResultMsg(2,"添加失败");
    }

    /*
     *@唐浩 查询教师
     **/
    @RequestMapping("/getTeacher")
    @ResponseBody
    public List<User> getTeacher(){
        List<User>  teacher = userservice.getTeacher();
        for(int i = 0;i<teacher.size();i++){
            System.out.println(teacher.get(i).getUserId());
        }

        return teacher;
    }

    /**/
    @RequestMapping("/getAllUser")
    @ResponseBody
    public pageBean getAllUser() {
        pageBean page = userservice.getAllUser();
        return page;
    }

    @RequestMapping("/User_viewList")
    @ResponseBody
    public pageBean User_viewList(Integer page){
        PageHelper.startPage(page, 8);
        List<User_view> user_views= userservice.getUser_view(page);
        int i = userservice.classTotal();
        String f = "no";
        pageBean in = new pageBean();
        in.setTotal(i);
        in.setFlag(f);
        in.setUser_viewList(user_views);
        return in;
    }

    /*
     *删除单个用户
     */
    @RequestMapping("/delOneUser")
    @ResponseBody
    public ResultMsg delOneUser(Integer userId){
        int i = userservice.delOneUser(userId);
        if(i>0){
            return new ResultMsg(1,"删除成功");
        }else{
            return new ResultMsg(1,"删除成功");
        }
    }
}
