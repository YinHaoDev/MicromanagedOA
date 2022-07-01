package com.micromanaged.oa.infrastructure.common;

public enum GlobalErrorEnum {
    POSITION_DELETE_ERROR(1, "岗位删除失败"),
    POSITION_ADD_ERROR(1, "岗位新增失败"),
    POSITION_MODIFY_ERROR(1, "岗位修改失败"),
    POSITION_QUERY_ERROR(1, "查无此岗位");

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
