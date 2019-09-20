package com.teachers.Service;

import com.teachers.Model.Class;
import com.teachers.Dao.classDao;
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

    public List<Class> findClass(){
        return classdao.findClass();
    };
}
