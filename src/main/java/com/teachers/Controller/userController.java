package com.teachers.Controller;

import com.teachers.Model.ResultMsg;
import com.teachers.Model.User;
import com.teachers.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class userController {
    @Autowired
    userService userservice;

    /*
     * @张彤  添加用户
     * */
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
        //  System.out.println(deptId);
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
}
