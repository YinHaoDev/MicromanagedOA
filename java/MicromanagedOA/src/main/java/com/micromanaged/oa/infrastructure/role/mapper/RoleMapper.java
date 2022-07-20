package com.micromanaged.oa.infrastructure.role.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.role.po.RolePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper extends BaseMapper<RolePO> {
    Integer insertRolePO(@Param("po") RolePO po);
}
