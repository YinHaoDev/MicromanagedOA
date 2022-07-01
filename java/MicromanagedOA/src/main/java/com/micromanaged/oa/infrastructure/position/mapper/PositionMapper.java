package com.micromanaged.oa.infrastructure.position.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.position.po.PositionPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PositionMapper extends BaseMapper<PositionPO> {

    int insertPositionPO(PositionPO position);
}
