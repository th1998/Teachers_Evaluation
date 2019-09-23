package com.teachers.Service;

import com.teachers.Dao.userDao;
import com.teachers.Model.Class;
import com.teachers.Model.User;
import com.teachers.Model.User_view;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public List<User> getTeacher(){
        return userdao.getTeacher();
    }

    /**/
    public pageBean getAllUser(){
        int t = userdao.user_viewTotal();
        List<User_view> a= userdao.getAllUser();
        String f = "no";
        pageBean page = new pageBean();
        page.setFlag(f);
        page.setTotal(t);
        page.setUser_viewList(a);
        return page;
    }
    public List<User_view> getUser_view(Integer page){
        List<User_view> a= userdao.getAllUser();
        return a;
    }
    public int classTotal(){
        return userdao.user_viewTotal();
    }

    public int delOneUser(Integer userId){
        return userdao.delOneUser(userId);
    }
}
