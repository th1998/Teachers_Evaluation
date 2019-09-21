package com.teachers.Service;

import com.teachers.Dao.roleDao;
import com.teachers.Model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class roleService {
    @Resource
    roleDao roledao;
    /*
      @唐浩
    * */
    public int addRole(String roleName){
        return roledao.addRole(roleName);
    }
    public List<Role> selectRole(){ return  roledao.selectRole();}
    public int delRole(Integer roleId){
        return roledao.delRole(roleId);
    }
}
