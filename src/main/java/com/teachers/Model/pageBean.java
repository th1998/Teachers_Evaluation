package com.teachers.Model;



import java.util.List;

public class pageBean {
    private Integer total;
    private String flag;
    private List<Dept> deptList;
    private List<Class> classList;
    private List<Term> termList;
    private List<Course> courseList;
    private List<User_view> user_viewList;
    private List<Option> optionList;
    private List<Quota> quotaList;




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

    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }

    public List<Term> getTermList() {
        return termList;
    }

    public void setTermList(List<Term> termList) {
        this.termList = termList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<User_view> getUser_viewList() {
        return user_viewList;
    }

    public void setUser_viewList(List<User_view> user_viewList) {
        this.user_viewList = user_viewList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public List<Quota> getQuotaList() {
        return quotaList;
    }

    public void setQuotaList(List<Quota> quotaList) {
        this.quotaList = quotaList;
    }
}
