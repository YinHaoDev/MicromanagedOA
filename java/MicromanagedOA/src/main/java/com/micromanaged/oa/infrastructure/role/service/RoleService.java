package com.micromanaged.oa.infrastructure.role.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.common.dto.BasePageDTO;
import com.micromanaged.oa.infrastructure.role.dto.RoleDTO;
import com.micromanaged.oa.infrastructure.role.po.RolePO;
import com.micromanaged.oa.infrastructure.role.vo.RoleMenuTreeViewVO;
import com.micromanaged.oa.infrastructure.role.vo.RoleVO;

public interface RoleService extends IService<RolePO> {
    IPage<RoleVO> getPageRoleVO(BasePageDTO<RoleDTO> dto);

    AbstractViewModel deleteRoleVO(RoleDTO dto);

    SingleViewModel<RoleMenuTreeViewVO> addRoleMenuTreeViewVO(RoleMenuTreeViewVO vo);

    AbstractViewModel modifyRoleMenuTreeViewVO(RoleMenuTreeViewVO vo);
}
