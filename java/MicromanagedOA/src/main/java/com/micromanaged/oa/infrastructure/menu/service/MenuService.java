package com.micromanaged.oa.infrastructure.menu.service;

import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.ListViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.menu.dto.MenuDTO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuVO;

public interface MenuService {
    ListViewModel<MenuTreeViewVO> getMenuTreeView(final MenuDTO dto);
    SingleViewModel<MenuVO> addMenu(final MenuVO vo);
    AbstractViewModel deleteMenu(final MenuDTO dto);
    AbstractViewModel modifyMenu(final  MenuVO vo);
}
