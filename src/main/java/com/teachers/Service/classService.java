package com.teachers.Service;

import com.teachers.Model.Class;
import com.teachers.Dao.classDao;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class classService {
    @Resource
    classDao classdao;
    /*
     *@李胤江  添加班级、删除班级
     **/
    public int addclass(String className){
        return classdao.addClass(className);
    };
    public int delOneClass(Integer classId){
        return classdao.delOneClass(classId);
    }

    /*
     *@张彤  查询班级
     **/
    public List<Class> findClass(){
        return classdao.findClass();
    };

    /*
     *@唐浩  班级列表分页
     **/
    public pageBean selectDept(){
        int t = classdao.classTotal();
        List<Class> a= classdao.selectClass();
        String f = "no";
        pageBean page = new pageBean();
        page.setFlag(f);
        page.setTotal(t);
        page.setClassList(a);
        return page;
    }
    public List<Class> getClass(Integer page){
        List<Class> a= classdao.selectClass();
        return a;
    }
    public int classTotal(){
        return classdao.classTotal();
    }

    public int updateClass(Integer classId,String className){
        return  classdao.updateClass(classId,className);
    }
}
