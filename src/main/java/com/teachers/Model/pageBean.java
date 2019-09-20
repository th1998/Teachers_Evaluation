package com.teachers.Model;



import java.util.List;

public class pageBean {
    private Integer total;
    private String flag;
    private List<Dept> deptList;

    public pageBean(Integer total,String flag,List<Dept> deptList){
        this.total = total;
        this.flag = flag;
        this.deptList = deptList;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<Dept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<Dept> deptList) {
        this.deptList = deptList;
    }
}
