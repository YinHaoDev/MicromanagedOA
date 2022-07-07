package com.micromanaged.oa.infrastructure.organization.vo;

import java.util.List;

public class OrganizationTreeViewVO extends OrganizationVO {
    private List<OrganizationTreeViewVO> children;

    public List<OrganizationTreeViewVO> getChildren() {
        return children;
    }

    public void setChildren(List<OrganizationTreeViewVO> children) {
        this.children = children;
    }
}
