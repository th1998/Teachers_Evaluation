package com.teachers.Utl;

public class sqlUtl {
    public String select(String deptName) {
        String sql = "select * from department where 1=1";
        if (deptName != null) {
            sql += " and CONCAT(deptName) LIKE #{deptName}";
        }
        return sql;
    }
}
