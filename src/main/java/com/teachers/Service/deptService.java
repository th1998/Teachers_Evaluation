package com.teachers.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teachers.Dao.deptDao;
import com.teachers.Model.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class deptService {
    @Resource
    deptDao deptdao;

    public int addDept(String deptName){
        return deptdao.addDept(deptName);
    }

    public PageInfo<Dept> selectDept(){
        List<Dept> a= deptdao.selectDept();
        PageInfo<Dept> page = new PageInfo<>(a);
        return page;
    }

    public List<Dept> getDept(Integer page){
        List<Dept> a= deptdao.selectDept();
        return a;
    }
}