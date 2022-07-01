package com.micromanaged.oa.infrastructure.position.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.micromanaged.oa.infrastructure.position.dto.PositionDTO;
import com.micromanaged.oa.infrastructure.position.po.PositionPO;

public interface PositionDAO {

    IPage<PositionPO> selectPositionPage(PageDTO<PositionPO> page, PositionDTO positionDTO);

    int insertPositionPO(PositionPO po);
}
