package com.teachers.Dao;

import com.teachers.Model.Quota;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ZT on 2019/9/26 9:42
 */
@Mapper
public interface quotaDao {
    /**
     * 功能描述:  添加问题
     * Param: [quotaName, percentage]
     * return: int
     * Author: ZT
     * Date: 2019/9/26
     */
    @Insert("insert into quota (quotaName,percentage) values(#{quotaName},#{percentage})")
    public int addQuota(Quota quota);

}
