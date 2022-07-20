package com.micromanaged.oa.infrastructure.role.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.role.po.RoleMenuPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenuPO> {
}