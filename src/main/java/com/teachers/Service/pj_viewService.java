package com.teachers.Service;

import com.teachers.Dao.pj_viewDao;
import com.teachers.Model.pj_view;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZT on 2019/9/29 10:22
 * 内容描述：所有评教对象视图
 */
@Service
public class pj_viewService {
    @Resource
    pj_viewDao pjViewDao;
    public List<pj_view> pjTeacher(){
        return pjViewDao.pjTeacher();
    }
    public List<pj_view> pjTeacher(Integer page){
        return pjViewDao.pjTeacher();
    }
    public int pjCount(){
        return pjViewDao.pjCount();
    }


}
