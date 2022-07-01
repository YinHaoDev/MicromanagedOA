package com.micromanaged.oa.infrastructure.position.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.common.dto.BasePageDTO;
import com.micromanaged.oa.infrastructure.position.dto.PositionDTO;
import com.micromanaged.oa.infrastructure.position.po.PositionPO;
import com.micromanaged.oa.infrastructure.position.vo.PositionVO;

public interface PositionService extends IService<PositionPO> {

    IPage<PositionVO> getPositionPage(BasePageDTO<PositionDTO> pageDTO);

    AbstractViewModel getPositionByID(PositionDTO positionDTO);

    SingleViewModel<PositionVO> addPositionVO(PositionVO vo);

    AbstractViewModel modifyPositionVO(PositionVO vo);

    AbstractViewModel deletePositionVO(PositionDTO positionDTO);
}
