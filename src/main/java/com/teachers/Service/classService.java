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
       @李胤江
    */
    public int addclass(String className){
        return classdao.addClass(className);
    };
    /*
      @张彤
    */
    public List<Class> findClass(){
        return classdao.findClass();
    };

    /*
    * @唐浩
    * */
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


    public int delOneClass(Integer classId){
        return classdao.delOneClass(classId);
    }
}
