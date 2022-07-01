package com.micromanaged.oa.infrastructure.position.dto;

public class PositionDTO {
    private Integer positionId;
    private String positionName;
    private String positionCode;
    private Integer positionStatus;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public Integer getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(Integer positionStatus) {
        this.positionStatus = positionStatus;
    }
}
