package com.micromanaged.oa.infrastructure.position.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micromanaged.oa.infrastructure.common.*;
import com.micromanaged.oa.infrastructure.common.dto.BasePageDTO;
import com.micromanaged.oa.infrastructure.position.dao.PositionDAO;
import com.micromanaged.oa.infrastructure.position.dto.PositionDTO;
import com.micromanaged.oa.infrastructure.position.mapper.PositionMapper;
import com.micromanaged.oa.infrastructure.position.po.PositionPO;
import com.micromanaged.oa.infrastructure.position.service.PositionService;
import com.micromanaged.oa.infrastructure.position.vo.PositionVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, PositionPO> implements PositionService {

    @Autowired
    public PositionServiceImpl(PositionDAO dao) {
        this.dao = dao;
    }

    private final PositionDAO dao;

    @Override
    public IPage<PositionVO> getPositionPage(BasePageDTO<PositionDTO> pageDTO) {
        return dao.selectPositionPage(new PageDTO<>(pageDTO.getPage(), pageDTO.getPageNo()), pageDTO.getParam()).convert(po -> {
            PositionVO vo = new PositionVO();
            BeanUtils.copyProperties(po, vo);
            return vo;
        });
    }

    @Override
    public AbstractViewModel getPositionByID(PositionDTO positionDTO) {
        PositionPO po = this.getById(positionDTO.getPositionId());
        if (null == po) {
            return ViewModelUtils.error(GlobalErrorEnum.POSITION_QUERY_ERROR);
        }

        PositionVO vo = new PositionVO();
        BeanUtils.copyProperties(po, vo);
        return new SingleViewModel<>(vo);
    }

    @Override
    public SingleViewModel<PositionVO> addPositionVO(PositionVO vo) {
        PositionPO po = new PositionPO();
        BeanUtils.copyProperties(vo, po);

        int positionId = this.dao.insertPositionPO(po);
        vo.setPositionId(positionId);
        return ViewModelUtils.singleView(0 < positionId, vo, GlobalSuccessEnum.POSITION_ADD_SUCCESS, GlobalErrorEnum.POSITION_ADD_ERROR);
    }

    @Override
    public AbstractViewModel modifyPositionVO(PositionVO vo) {
        if (ObjectUtils.isEmpty(vo) || 0 >= vo.getPositionId()) {
            return ViewModelUtils.error(GlobalErrorEnum.POSITION_QUERY_ERROR);
        }

        PositionPO po = new PositionPO();
        BeanUtils.copyProperties(vo, po);

        boolean modifiedOK = this.updateById(po);
        return ViewModelUtils.createSuccessOrError(modifiedOK, GlobalSuccessEnum.POSITION_MODIFY_SUCCESS, GlobalErrorEnum.POSITION_MODIFY_ERROR);
    }

    @Override
    public AbstractViewModel deletePositionVO(PositionDTO positionDTO) {
        if (ObjectUtils.isEmpty(positionDTO) || 0 >= positionDTO.getPositionId()) {
            return ViewModelUtils.error(GlobalErrorEnum.POSITION_QUERY_ERROR);
        }

        boolean delOK = this.removeById(positionDTO.getPositionId());
        return ViewModelUtils.createSuccessOrError(delOK, GlobalSuccessEnum.POSITION_DELETE_SUCCESS, GlobalErrorEnum.POSITION_DELETE_ERROR);
    }
}
