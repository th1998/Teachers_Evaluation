package com.teachers.Service;

import com.teachers.Dao.termDao;
import com.teachers.Model.Term;
import com.teachers.Model.pageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class termService {
    @Resource
    termDao termdao;
    /*
     *@余时南  添加学期、删除学期
     **/
    public int add_term(String termName){ return termdao.add_term(termName); }
    public int delOneTerm(Integer termId){
        return termdao.delOneTerm(termId);
    }

    /*
     *@唐浩  学期列表分页
     **/
    public pageBean selectTerm(){
        int t = termdao.termTotal();
        List<Term> a= termdao.selectTerm();
        String f = "no";
        pageBean page = new pageBean();
        page.setFlag(f);
        page.setTotal(t);
        page.setTermList(a);
        return page;
    }
    public List<Term> getTerm(Integer page){
        List<Term> a= termdao.selectTerm();
        return a;
    }
    public int termTotal(){
        return termdao.termTotal();
    }


    public List<Term> terms(){
        List<Term> a= termdao.selectTerm();
        return a;
    }
}
