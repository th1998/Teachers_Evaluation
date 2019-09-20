package com.teachers.Utl;

import com.teachers.Model.Dept;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class sqlUtl {
    public String select(String deptName) {
        String sql = "select * from department where 1=1";
        if (deptName != null) {
            sql += " and CONCAT(deptName) LIKE #{deptName}";
        }
        return sql;
    }

    public String delAll(String ids){
        String sql = "delete from department where deptId in (";
        List<Object> list = new ArrayList<>();
        String[] str = ids.split(",");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        sql += "list)";
        System.out.println(sql);
        return sql;
    }
}
