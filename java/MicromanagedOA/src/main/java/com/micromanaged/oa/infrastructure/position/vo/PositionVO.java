package com.micromanaged.oa.infrastructure.position.vo;

public class PositionVO {
    private Integer positionId;
    private String positionCode;
    private String positionName;
    private Integer positionSort;
    private Integer positionStatus;
    private String positionRemark;
    private Integer deleteFlag;
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
