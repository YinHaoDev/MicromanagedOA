package com.micromanaged.oa.infrastructure.menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.menu.po.MenuPO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<MenuPO> {

    List<MenuTreeViewVO> selectMenuTreeViewVO(String menuName, Integer status);
}
