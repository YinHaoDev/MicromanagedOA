package com.micromanaged.oa.infrastructure.position.vo;

public class PositionVO {
    private int positionId;
    private String positionCode;
    private String positionName;
    private int positionSort;
    private int positionStatus;
    private String positionRemark;
    private int deleteFlag;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
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

    public int getPositionSort() {
        return positionSort;
    }

    public void setPositionSort(int positionSort) {
        this.positionSort = positionSort;
    }

    public int getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(int positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getPositionRemark() {
        return positionRemark;
    }

    public void setPositionRemark(String positionRemark) {
        this.positionRemark = positionRemark;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
