package com.micromanaged.oa.infrastructure.position.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.micromanaged.oa.infrastructure.position.dto.PositionDTO;
import com.micromanaged.oa.infrastructure.position.mapper.PositionMapper;
import com.micromanaged.oa.infrastructure.position.po.PositionPO;
import com.micromanaged.oa.infrastructure.position.dao.PositionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class PositionDAOImpl implements PositionDAO {

    @Autowired
    public PositionDAOImpl(PositionMapper mapper) {
        this.mapper = mapper;
    }

    private final PositionMapper mapper;

    @Override
    public IPage<PositionPO> selectPositionPage(PageDTO<PositionPO> page, PositionDTO positionDTO) {

        LambdaQueryWrapper<PositionPO> wrapper = Wrappers.lambdaQuery();

        if (StringUtils.hasText(positionDTO.getPositionCode())) {
            wrapper.like(PositionPO::getPositionCode, positionDTO.getPositionCode());
        }

        if (StringUtils.hasText(positionDTO.getPositionName())) {
            wrapper.like(PositionPO::getPositionName, positionDTO.getPositionName());
        }

        if (!ObjectUtils.isEmpty(positionDTO.getPositionStatus())) {
            wrapper.eq(PositionPO::getPositionStatus, positionDTO.getPositionStatus());
        }

        return mapper.selectPage(page, wrapper);
    }

    @Override
    public int insertPositionPO(PositionPO po) {
        return mapper.insertPositionPO(po);
    }
}
