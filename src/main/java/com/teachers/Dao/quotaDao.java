package com.teachers.Dao;

import com.teachers.Model.Quota;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    @Select("select * from quota")
    public List<Quota> selectQuota();
    @Select("select count(*) from quota")
    public int quotaSL();

    @Update("update quota set quotaName = #{quotaName} where quotaId = #{quotaId}")
    public int updateQuota(@Param("quotaId") Integer quotaId, @Param("quotaName") String quotaName);

    @Delete("delete from quota where quotaId = #{quotaId}")
    public int delOneQuota(Integer quotaId);

}
