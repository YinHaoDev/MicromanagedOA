package com.micromanaged.oa.infrastructure.menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.menu.po.MenuPO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<MenuPO> {

    List<MenuTreeViewVO> selectMenuTreeViewVO(@Param("menuName") String menuName, @Param("status") Integer status);

    Integer insertMenuPO(@Param("po") MenuPO po);
}
