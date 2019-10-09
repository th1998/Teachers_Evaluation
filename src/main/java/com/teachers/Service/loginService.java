package com.teachers.Service;

import com.teachers.Dao.testDao;
import com.teachers.Model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class loginService {
    @Resource
    testDao testdao;

    public List<User> login(String userNO,String userPass,Integer roleId){
        return testdao.login(userNO,userPass,roleId);
    }
}
