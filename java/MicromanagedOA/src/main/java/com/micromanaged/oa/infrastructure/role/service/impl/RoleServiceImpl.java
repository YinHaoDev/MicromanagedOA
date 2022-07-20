package com.micromanaged.oa.infrastructure.role.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micromanaged.oa.infrastructure.common.*;
import com.micromanaged.oa.infrastructure.common.dto.BasePageDTO;
import com.micromanaged.oa.infrastructure.role.dto.RoleDTO;
import com.micromanaged.oa.infrastructure.role.mapper.RoleMapper;
import com.micromanaged.oa.infrastructure.role.po.RoleMenuPO;
import com.micromanaged.oa.infrastructure.role.po.RolePO;
import com.micromanaged.oa.infrastructure.role.service.RoleMenuService;
import com.micromanaged.oa.infrastructure.role.service.RoleService;
import com.micromanaged.oa.infrastructure.role.vo.RoleMenuTreeViewVO;
import com.micromanaged.oa.infrastructure.role.vo.RoleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RolePO> implements RoleService {

    @Autowired
    public RoleServiceImpl(RoleMenuService roleMenuService) {
        this.roleMenuService = roleMenuService;
    }

    private final RoleMenuService roleMenuService;

    @Override
    public IPage<RoleVO> getPageRoleVO(BasePageDTO<RoleDTO> dto) {

        LambdaQueryWrapper<RolePO> wrapper = Wrappers.lambdaQuery();

        if (!ObjectUtils.isEmpty(dto) && !ObjectUtils.isEmpty(dto.getParam())) {
            if (0 == dto.getParam().getRoleStatus() || 1 == dto.getParam().getRoleStatus()) {
                wrapper.eq(RolePO::getRoleStatus, dto.getParam().getRoleStatus());
            }

            if (StringUtils.hasText(dto.getParam().getRoleName())) {
                wrapper.eq(RolePO::getRoleName, dto.getParam().getRoleName());
            }

            if (StringUtils.hasText(dto.getParam().getRoleMark())) {
                wrapper.eq(RolePO::getRoleMark, dto.getParam().getRoleMark());
            }
        }

        Page<RolePO> page = PageDTO.of(dto.getPageNo(), dto.getPage());

        return page(page, wrapper).convert(po -> {
            RoleVO vo = new RoleVO();
            BeanUtils.copyProperties(po, vo);
            return vo;
        });
    }

    @Override
    public AbstractViewModel deleteRoleVO(RoleDTO dto) {
        boolean deleted = this.removeById(dto.getRoleId());
        return ViewModelUtils.createSuccessOrError(deleted, GlobalSuccessEnum.MENU_DELETE_SUCCESS, GlobalErrorEnum.MENU_DELETE_ERROR);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public SingleViewModel<RoleMenuTreeViewVO> addRoleMenuTreeViewVO(RoleMenuTreeViewVO vo) {

        try {

            boolean state = true;

            RolePO rolePO = new RolePO();
            BeanUtils.copyProperties(vo, rolePO);
            Integer roleId = this.baseMapper.insertRolePO(rolePO);
            if (!ObjectUtils.isEmpty(roleId) && 0 < roleId) {
                rolePO.setRoleId(roleId);
                vo.setRoleId(roleId);

                if (!CollectionUtils.isEmpty(vo.getMenuTreeView())) {
                    List<RoleMenuPO> roleMenus = vo.getMenuTreeView().stream().map(item -> {
                        RoleMenuPO roleMenuPO = new RoleMenuPO();
                        roleMenuPO.setRoleId(roleId);
                        roleMenuPO.setMenuId(item.getMenuId());
                        return roleMenuPO;
                    }).collect(Collectors.toList());
                    state = this.roleMenuService.saveBatch(roleMenus);
                }
            }

            return ViewModelUtils.singleView(state, vo, GlobalSuccessEnum.ROLE_ADD_SUCCESS, GlobalErrorEnum.ROLE_ADD_ERROR);
        } catch (Exception e) {
            return ViewModelUtils.singleView(false, null, GlobalSuccessEnum.ROLE_ADD_SUCCESS, GlobalErrorEnum.ROLE_ADD_ERROR);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public AbstractViewModel modifyRoleMenuTreeViewVO(RoleMenuTreeViewVO vo) {

        try {

            RolePO rolePO = new RolePO();
            BeanUtils.copyProperties(vo, rolePO);
            boolean state = this.updateById(rolePO);
            if (state && !CollectionUtils.isEmpty(vo.getMenuTreeView())) {
                LambdaQueryWrapper<RoleMenuPO> wrapper = Wrappers.lambdaQuery();
                wrapper.eq(RoleMenuPO::getRoleId, rolePO.getRoleId());
                state = this.roleMenuService.remove(wrapper);
                if (state) {
                    List<RoleMenuPO> roleMenus = vo.getMenuTreeView().stream().map(item -> {
                        RoleMenuPO roleMenuPO = new RoleMenuPO();
                        roleMenuPO.setRoleId(rolePO.getRoleId());
                        roleMenuPO.setMenuId(item.getMenuId());
                        return roleMenuPO;
                    }).collect(Collectors.toList());
                    state = this.roleMenuService.saveBatch(roleMenus);
                }
            }

            return ViewModelUtils.singleView(state, vo, GlobalSuccessEnum.ROLE_MODIFY_SUCCESS, GlobalErrorEnum.ROLE_MODIFY_ERROR);
        } catch (Exception e) {
            return ViewModelUtils.singleView(false, null, GlobalSuccessEnum.ROLE_MODIFY_SUCCESS, GlobalErrorEnum.ROLE_MODIFY_ERROR);
        }
    }
}
