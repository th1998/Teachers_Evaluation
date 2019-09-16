package com.teachers.Service;

import com.teachers.Dao.roleDao;
import com.teachers.Model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class roleService {
    @Resource
    roleDao roledao;
    public int addRole(String roleName){
        return roledao.addRole(roleName);
    }
}
