package com.teachers.Service;

import com.teachers.Dao.deptDao;
import com.teachers.Model.Dept;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class deptService {
    @Resource
    deptDao deptdao;


    /*
      @胡志航
     */
    public int addDept(String deptName){
        return deptdao.addDept(deptName);
    }


    /*
       @唐浩
    */
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



    public int delOneDept(Integer deptId){
        return deptdao.delOneDept(deptId);
    }

    /*public int delAll(String ids){
        return deptdao.delAll(ids);
    }*/

    /*
      @张彤
    */
    public List<Dept> findDept(){
        return deptdao.findDept();
    }
}