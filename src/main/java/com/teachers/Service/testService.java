package com.teachers.Service;

import com.teachers.Dao.testDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @唐浩
 * */
@Service
public class testService {
    @Autowired
    testDao testdao;

    public int delAlla(List<Object> list){
        return testdao.delAlla(list);
    }
    public int delClasses(List<Object> list){
        return testdao.delClasses(list);
    }
    public int delTerms(List<Object> list){
        return testdao.delTerms(list);
    }
}
