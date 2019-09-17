package com.teachers.Service;

import com.teachers.Dao.deptDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class deptService {
    @Resource
    deptDao deptdao;
    public int addDept(String deptName){
        return deptdao.addDept(deptName);
    }

}