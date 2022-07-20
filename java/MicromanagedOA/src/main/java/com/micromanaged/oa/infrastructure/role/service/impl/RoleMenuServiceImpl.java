package com.micromanaged.oa.infrastructure.role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micromanaged.oa.infrastructure.role.mapper.RoleMenuMapper;
import com.micromanaged.oa.infrastructure.role.po.RoleMenuPO;
import com.micromanaged.oa.infrastructure.role.service.RoleMenuService;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuPO> implements RoleMenuService {
}
