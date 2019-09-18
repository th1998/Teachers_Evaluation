package com.teachers.Service;

import com.teachers.Dao.termDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class termService {
    @Resource
    termDao termdao;
    /*
       @余时南
       * */
    public int add_term(String termName){ return termdao.add_term(termName); }
}
