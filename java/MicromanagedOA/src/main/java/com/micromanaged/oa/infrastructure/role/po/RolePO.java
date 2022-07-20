package com.micromanaged.oa.infrastructure.role.po;

import com.baomidou.mybatisplus.annotation.*;

@TableName("sys_role")
public class RolePO {
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;
    @TableField(value = "role_name")
    private String roleName;
    @TableField(value = "role_mark")
    private String roleMark;
    @TableField(value = "role_sort")
    private Integer roleSort;
    @TableField(value = "role_status")
    private Integer roleStatus;
    @TableField(value = "role_remark")
    private String roleRemark;
    @TableField(value = "delete_flag")
    @TableLogic(value = "0", delval = "1")
    private Integer deleteFlag;
    @TableField(value = "version")
    @Version
    private Integer version;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleMark() {
        return roleMark;
    }

    public void setRoleMark(String roleMark) {
        this.roleMark = roleMark;
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
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
