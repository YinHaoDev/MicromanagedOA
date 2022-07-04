package com.micromanaged.oa.infrastructure.organization.dto;

public class OrganizationDTO {
    private String orgName;
    private Integer orgStatus;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }
}
