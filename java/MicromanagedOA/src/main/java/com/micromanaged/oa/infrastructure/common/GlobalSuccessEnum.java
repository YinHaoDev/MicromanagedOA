package com.micromanaged.oa.infrastructure.common;

public enum GlobalSuccessEnum {
    POSITION_DELETE_SUCCESS(0, "岗位新增成功"),
    POSITION_ADD_SUCCESS(0, "岗位新增成功"),
    POSITION_MODIFY_SUCCESS(0, "岗位修改成功"),
    POSITION_QUERY_SUCCESS(0, "查询岗位成功"),
    ORGANIZATION_QUERY_SUCCESS(0, "组织信息查询成功"),
    ORGANIZATION_ADD_SUCCESS(0, "新增组织信息成功"),
    ORGANIZATION_DELETE_SUCCESS(0, "删除组织信息成功"),
    ORGANIZATION_MODIFY_SUCCESS(0, "更新组织信息成功"),
    MENU_QUERY_SUCCESS(0, "查询菜单成功"),
    MENU_ADD_SUCCESS(0, "新增菜单成功"),
    MENU_DELETE_SUCCESS(0, "删除菜单成功"),
    MENU_MODIFY_SUCCESS(0, "更新菜单成功"),
    ROLE_ADD_SUCCESS(0, "角色新增成功"),
    ROLE_MODIFY_SUCCESS(0, "角色修改成功");

    GlobalSuccessEnum(int code, String msg) {
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
