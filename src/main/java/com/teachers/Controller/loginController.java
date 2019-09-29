package com.teachers.Controller;

import com.teachers.Model.User;
import com.teachers.Service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class loginController {
    @Autowired
    loginService loginservice;

    @RequestMapping("/login")
    @ResponseBody
    public List<User> login(String userNO, String userPass, String roleName){
        return loginservice.login(userNO,userPass,roleName);
    }
}
