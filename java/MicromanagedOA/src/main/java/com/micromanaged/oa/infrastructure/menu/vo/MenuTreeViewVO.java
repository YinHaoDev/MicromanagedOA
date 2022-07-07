package com.micromanaged.oa.infrastructure.menu.vo;

import java.util.List;

public class MenuTreeViewVO extends MenuVO {
    private List<MenuTreeViewVO> children;

    public List<MenuTreeViewVO> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTreeViewVO> children) {
        this.children = children;
    }
}
