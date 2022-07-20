package com.micromanaged.oa.infrastructure.role.vo;

import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;

import java.util.List;

public class RoleMenuTreeViewVO extends RoleVO {

    private List<MenuTreeViewVO> menuTreeView;

    public List<MenuTreeViewVO> getMenuTreeView() {
        return menuTreeView;
    }

    public void setMenuTreeView(List<MenuTreeViewVO> menuTreeView) {
        this.menuTreeView = menuTreeView;
    }
}
