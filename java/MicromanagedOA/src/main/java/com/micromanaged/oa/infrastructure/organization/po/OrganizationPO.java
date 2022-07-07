package com.micromanaged.oa.infrastructure.organization.po;

import com.baomidou.mybatisplus.annotation.*;

@TableName("sys_org")
public class OrganizationPO {

    @TableId(value = "org_id", type = IdType.AUTO)
    private Integer orgId;
    @TableField(value = "org_parent_id")
    private Integer orgParentId;
    @TableField(value = "org_name")
    private String orgName;
    @TableField(value = "org_sort")
    private Integer orgSort;
    @TableField(value = "org_leader")
    private String orgLeader;
    @TableField(value = "org_phone")
    private String orgPhone;
    @TableField(value = "org_email")
    private String orgEmail;
    @TableField(value = "org_status")
    private Integer orgStatus;
    @TableLogic(value = "0", delval = "1")
    @TableField(value = "delete_flag")
    private Integer deleteFlag;
    @Version
    @TableField(value = "version")
    private Integer version;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Integer orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getOrgSort() {
        return orgSort;
    }

    public void setOrgSort(Integer orgSort) {
        this.orgSort = orgSort;
    }

    public String getOrgLeader() {
        return orgLeader;
    }

    public void setOrgLeader(String orgLeader) {
        this.orgLeader = orgLeader;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
