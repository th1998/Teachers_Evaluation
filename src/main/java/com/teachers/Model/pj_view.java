package com.teachers.Model;

/**
 * Created by ZT on 2019/9/29 10:03
 * 内容描述：所有评教对象视图
 */
public class pj_view {
    private Integer courseId;
    private String courseName;
    private Integer userId;
    private String  userName;
    private Integer termId;
    private String   termName;
    private int termStatus;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public int getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(int termStatus) {
        this.termStatus = termStatus;
    }
}
