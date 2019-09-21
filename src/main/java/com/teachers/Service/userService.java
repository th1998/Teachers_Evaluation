package com.teachers.Service;

import com.teachers.Dao.userDao;
import com.teachers.Model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userService {
    @Resource
    userDao userdao;
    /*
     *@张彤  添加用户
     **/
    public int addUser(User user){
        return userdao.addUser(user);
    }
}
