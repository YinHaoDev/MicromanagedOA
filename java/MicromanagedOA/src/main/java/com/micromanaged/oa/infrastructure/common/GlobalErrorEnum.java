package com.micromanaged.oa.infrastructure.common;

public enum GlobalErrorEnum {
    POSITION_DELETE_ERROR(1, "岗位删除失败"),
    POSITION_ADD_ERROR(1, "岗位新增失败"),
    POSITION_MODIFY_ERROR(1, "岗位修改失败"),
    POSITION_QUERY_ERROR(1, "查无此岗位"),
    ORGANIZATION_QUERY_ERROR(1, "查无此组织信息"),
    ORGANIZATION_ADD_ERROR(1, "新增组织信息失败"),
    ORGANIZATION_DELETE_ERROR(1, "删除组织信息失败"),
    ORGANIZATION_MODIFY_ERROR(1, "更新组织信息失败"),
    MENU_QUERY_ERROR(1, "查询菜单失败"),
    MENU_ADD_ERROR(1, "新增菜单失败"),
    MENU_DELETE_ERROR(1, "删除菜单失败"),
    MENU_MODIFY_ERROR(1, "更新菜单失败"),
    ROLE_ADD_ERROR(1, "角色新增失败"),
    ROLE_MODIFY_ERROR(1, "角色修改失败");

    GlobalErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
