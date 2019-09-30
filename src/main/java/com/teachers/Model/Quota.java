package com.teachers.Model;

public class Quota {
    private Integer quotaId;
    private String quotaName;
    private Double percentage;
    private Integer option_groupId;

    public Integer getOption_groupId() {
        return option_groupId;
    }

    public void setOption_groupId(Integer option_groupId) {
        this.option_groupId = option_groupId;
    }

    public Integer getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(Integer quotaId) {
        this.quotaId = quotaId;
    }

    public String getQuotaName() {
        return quotaName;
    }

    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
