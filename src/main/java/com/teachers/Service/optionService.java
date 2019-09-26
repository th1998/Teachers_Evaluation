package com.teachers.Service;

import com.teachers.Dao.optionDao;
import com.teachers.Model.Option;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZT on 2019/9/26 11:11
 */
@Service
public class optionService {
    @Resource
    optionDao optionDao;

    public int addOption(Option option){
        return optionDao.addOption(option);
    }


}
