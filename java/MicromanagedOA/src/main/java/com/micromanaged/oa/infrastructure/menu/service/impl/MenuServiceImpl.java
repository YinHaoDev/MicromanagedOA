package com.micromanaged.oa.infrastructure.menu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micromanaged.oa.infrastructure.common.*;
import com.micromanaged.oa.infrastructure.menu.dto.MenuDTO;
import com.micromanaged.oa.infrastructure.menu.mapper.MenuMapper;
import com.micromanaged.oa.infrastructure.menu.po.MenuPO;
import com.micromanaged.oa.infrastructure.menu.service.MenuService;
import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuPO> implements MenuService {

    @Override
    public ListViewModel<MenuTreeViewVO> getMenuTreeView(final MenuDTO dto) {
        List<MenuTreeViewVO> items = this.baseMapper.selectMenuTreeViewVO(dto.getMenuName(), dto.getMenuStatus());
        boolean state = !CollectionUtils.isEmpty(items) && 0 < items.size();
        return ViewModelUtils.listView(state, items, GlobalSuccessEnum.MENU_QUERY_SUCCESS, GlobalErrorEnum.MENU_QUERY_ERROR);
    }

    @Override
    public SingleViewModel<MenuVO> addMenu(final MenuVO vo) {
        if (ObjectUtils.isEmpty(vo) || 0 < vo.getMenuId()) {
            return ViewModelUtils.singleView(false, null, GlobalSuccessEnum.MENU_ADD_SUCCESS, GlobalErrorEnum.MENU_ADD_ERROR);
        }

        MenuPO po = new MenuPO();
        BeanUtils.copyProperties(vo, po);
        Integer menuId = this.baseMapper.insertMenuPO(po);
        vo.setMenuId(menuId);

        return ViewModelUtils.singleView(0 < menuId, vo, GlobalSuccessEnum.MENU_ADD_SUCCESS, GlobalErrorEnum.MENU_ADD_ERROR);
    }

    @Override
    public AbstractViewModel deleteMenu(final MenuDTO dto) {
        boolean deleted = this.removeById(dto.getMenuId());
        return ViewModelUtils.createSuccessOrError(deleted, GlobalSuccessEnum.MENU_DELETE_SUCCESS, GlobalErrorEnum.MENU_DELETE_ERROR);
    }

    @Override
    public AbstractViewModel modifyMenu(final MenuVO vo) {
        MenuPO po = new MenuPO();
        BeanUtils.copyProperties(vo, po);
        boolean modified = this.updateById(po);
        return ViewModelUtils.createSuccessOrError(modified, GlobalSuccessEnum.MENU_MODIFY_SUCCESS, GlobalErrorEnum.MENU_MODIFY_ERROR);
    }
}
