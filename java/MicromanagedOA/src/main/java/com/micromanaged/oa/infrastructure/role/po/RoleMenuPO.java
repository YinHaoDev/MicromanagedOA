package com.micromanaged.oa.infrastructure.role.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "sys_role_menu")
public class RoleMenuPO {
    @TableField(value = "role_id")
    private Integer roleId;
    @TableField(value = "menu_id")
    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
