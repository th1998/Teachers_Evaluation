package com.teachers.Service;

import com.teachers.Dao.classDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class classService {
    @Resource
    classDao classdao;

    public int addclass(String className){
        return classdao.addClass(className);
    };
}
