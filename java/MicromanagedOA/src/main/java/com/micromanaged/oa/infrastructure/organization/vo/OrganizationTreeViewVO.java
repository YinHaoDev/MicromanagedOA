package com.micromanaged.oa.infrastructure.organization.vo;

import java.util.List;

public class OrganizationTreeViewVO extends OrganizationVO {
    private List<OrganizationVO> children;

    public List<OrganizationVO> getChildren() {
        return children;
    }

    public void setChildren(List<OrganizationVO> children) {
        this.children = children;
    }
}
