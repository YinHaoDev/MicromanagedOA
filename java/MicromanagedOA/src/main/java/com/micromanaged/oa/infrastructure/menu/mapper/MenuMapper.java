package com.micromanaged.oa.infrastructure.menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.menu.po.MenuPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper extends BaseMapper<MenuPO> {
}
