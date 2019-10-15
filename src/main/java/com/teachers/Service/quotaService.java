package com.teachers.Service;

import com.sun.org.apache.regexp.internal.RE;
import com.teachers.Dao.quotaDao;
import com.teachers.Model.Qo;
import com.teachers.Model.Quota;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class quotaService {
    @Resource
    quotaDao quotaDao;
    /**
     * 功能描述:
     * Param: [quota]
     * return: int
     * Author: ZT
     * Date: 2019/9/26
     */
    public int addQuota(Quota quota){
        return quotaDao.addQuota(quota);
    }

    public List<Quota> selectQuota(){
        return quotaDao.selectQuota();
    }

    public List<Quota> selectQuota(Integer page){
        return quotaDao.selectQuota();
    }


    public int quotaSL(){
        return quotaDao.quotaSL();
    }

    public int updateQuota(Integer quotaId,String quotaName){
        return quotaDao.updateQuota(quotaId,quotaName);
    }

    public int delOneQuota(Integer quotaId){
        return quotaDao.delOneQuota(quotaId);
    }

    //问题选项列表
    public List<Qo> qo(){
        return quotaDao.qo();
    }
    public List<Qo> qo(Integer page){
        return quotaDao.qo();
    }
    public int qoaSL(){ return quotaDao.qoSL();}
}
