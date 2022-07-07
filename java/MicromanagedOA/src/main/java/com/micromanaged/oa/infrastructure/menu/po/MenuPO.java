package com.micromanaged.oa.infrastructure.menu.po;

import com.baomidou.mybatisplus.annotation.*;

@TableName(value = "sys_menu")
public class MenuPO {

    @TableId(value = "menu_id", type = IdType.AUTO)
    private Integer menuId;
    @TableField(value = "menu_parent_id")
    private Integer menuParentId;
    @TableField(value = "menu_name")
    private String menuName;
    @TableField(value = "menu_sort")
    private Integer menuSort;
    @TableField(value = "menu_url")
    private String menuUrl;
    @TableField(value = "menu_type")
    private Integer menuType;
    @TableField(value = "menu_status")
    private Integer menuStatus;
    @TableField(value = "menu_icon")
    private String menuIcon;
    @TableField(value = "menu_open_type")
    private Integer menuOpenType;
    @TableField(value = "menu_visible")
    private Integer menuVisible;
    @TableField(value = "menu_remark")
    private String menuRemark;
    @TableField(value = "menu_component_path")
    private String menuComponentPath;
    @TableField(value = "menu_permission_mark")
    private String menuPermissionMark;
    @TableLogic(value = "0", delval = "1")
    @TableField(value = "delete_flag")
    private Integer deleteFlag;
    @Version
    @TableField(value = "version")
    private Integer version;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public Integer getMenuOpenType() {
        return menuOpenType;
    }

    public void setMenuOpenType(Integer menuOpenType) {
        this.menuOpenType = menuOpenType;
    }

    public Integer getMenuVisible() {
        return menuVisible;
    }

    public void setMenuVisible(Integer menuVisible) {
        this.menuVisible = menuVisible;
    }

    public String getMenuRemark() {
        return menuRemark;
    }

    public void setMenuRemark(String menuRemark) {
        this.menuRemark = menuRemark;
    }

    public String getMenuComponentPath() {
        return menuComponentPath;
    }

    public void setMenuComponentPath(String menuComponentPath) {
        this.menuComponentPath = menuComponentPath;
    }

    public String getMenuPermissionMark() {
        return menuPermissionMark;
    }

    public void setMenuPermissionMark(String menuPermissionMark) {
        this.menuPermissionMark = menuPermissionMark;
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
