package com.teachers.Service;

import com.teachers.Dao.testDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testService {
    @Autowired
    testDao testdao;

    public int delAlla(List<Object> list){
        return testdao.delAlla(list);
    }
}
