package com.micromanaged.oa.infrastructure.position.po;

import com.baomidou.mybatisplus.annotation.*;
import org.apache.ibatis.type.JdbcType;

@TableName("sys_position")
public class PositionPO {
    @TableId(value = "position_id", type = IdType.AUTO)
    private Integer positionId;
    @TableField(value = "position_code")
    private String positionCode;
    @TableField(value = "position_name")
    private String positionName;
    @TableField(value = "position_sort")
    private Integer positionSort;
    @TableField(value = "position_status")
    private Integer positionStatus;
    @TableField(value = "position_remark")
    private String positionRemark;
    @TableLogic(value = "0", delval = "1")
    @TableField(value = "delete_flag")
    private Integer deleteFlag;
    @Version
    @TableField(value = "version")
    private Integer version;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionSort() {
        return positionSort;
    }

    public void setPositionSort(Integer positionSort) {
        this.positionSort = positionSort;
    }

    public Integer getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(Integer positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getPositionRemark() {
        return positionRemark;
    }

    public void setPositionRemark(String positionRemark) {
        this.positionRemark = positionRemark;
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
