package com.teachers.Service;

import com.teachers.Dao.deptDao;
import com.teachers.Dao.testDao;
import com.teachers.Model.Dept;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class deptService {
    @Resource
    deptDao deptdao;
    @Resource
    testDao testdao;

    /*
     *@胡志航  添加院系、删除单个院系
     **/
    public int addDept(String deptName){
        return deptdao.addDept(deptName);
    }
    public int delOneDept(Integer deptId){
        return deptdao.delOneDept(deptId);
    }

    /*
     *@唐浩  院系列表分页
     **/
    public pageBean selectDept(){
        int t = deptdao.deptTotal();
        List<Dept> a= deptdao.selectDept();
        String f = "no";
        pageBean page = new pageBean();
        page.setTotal(t);
        page.setFlag(f);
        page.setDeptList(a);
        return page;
    }
    public List<Dept> getDept(Integer page){
        List<Dept> a= deptdao.selectDept();
        return a;
    }
    public int deptTotal(){
        return deptdao.deptTotal();
    }

    public int updateDept(Integer deptId,String deptName){
        return deptdao.updateDept(deptId,deptName);
    }

    public List<Dept> likeFaculty(String deptName){
        return testdao.likeFaculty(deptName);
    }
    public int likeFacultySL(String deptName){
        return testdao.likeFacultySL(deptName);
    }


    public int selectRoleSl(Integer deptId){
        return testdao.selectRoleSl(deptId);
    }

    /*
     *@张彤  查询院系
     **/
    public List<Dept> findDept(){
        return deptdao.findDept();
    }
}