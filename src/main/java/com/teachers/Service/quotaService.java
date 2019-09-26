package com.teachers.Service;

import com.teachers.Dao.quotaDao;
import com.teachers.Model.Quota;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
