package com.micromanaged.oa.infrastructure.common;

public enum GlobalSuccessEnum {
    POSITION_DELETE_SUCCESS(0, "岗位新增成功"),
    POSITION_ADD_SUCCESS(0, "岗位新增成功"),
    POSITION_MODIFY_SUCCESS(0, "岗位修改成功"),
    POSITION_QUERY_SUCCESS(0, "查询岗位成功");

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
