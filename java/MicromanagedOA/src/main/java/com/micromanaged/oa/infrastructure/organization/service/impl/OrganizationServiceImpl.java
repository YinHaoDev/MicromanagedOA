package com.micromanaged.oa.infrastructure.organization.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micromanaged.oa.infrastructure.common.*;
import com.micromanaged.oa.infrastructure.organization.dto.OrganizationDTO;
import com.micromanaged.oa.infrastructure.organization.mapper.OrganizationMapper;
import com.micromanaged.oa.infrastructure.organization.po.OrganizationPO;
import com.micromanaged.oa.infrastructure.organization.service.OrganizationService;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationTreeViewVO;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class OrganizationServiceImpl extends ServiceImpl<OrganizationMapper, OrganizationPO> implements OrganizationService {

    @Override
    public ListViewModel<OrganizationTreeViewVO> getOrgTreeView(final OrganizationDTO dto) {
        List<OrganizationTreeViewVO> items = this.baseMapper.selectOrganizationTreeView(dto.getOrgName(), dto.getOrgStatus());
        boolean state = !CollectionUtils.isEmpty(items) && 0 < items.size();
        return ViewModelUtils.listView(state, items, GlobalSuccessEnum.ORGANIZATION_QUERY_SUCCESS, GlobalErrorEnum.ORGANIZATION_QUERY_ERROR);
    }

    @Override
    public SingleViewModel<OrganizationVO> addOrg(final OrganizationVO vo) {
        if (ObjectUtils.isEmpty(vo) || 0 < vo.getOrgId()) {
            return ViewModelUtils.singleView(false, null, GlobalSuccessEnum.ORGANIZATION_ADD_SUCCESS, GlobalErrorEnum.ORGANIZATION_ADD_ERROR);
        }

        OrganizationPO po = new OrganizationPO();
        BeanUtils.copyProperties(vo, po);

        Integer addedNewID = this.baseMapper.insertOrganizationPO(po);
        vo.setOrgId(addedNewID);

        return ViewModelUtils.singleView(0 < addedNewID, vo, GlobalSuccessEnum.ORGANIZATION_ADD_SUCCESS, GlobalErrorEnum.ORGANIZATION_ADD_ERROR);
    }

    @Override
    public AbstractViewModel deleteOrg(Integer orgId) {
        boolean deleted = this.removeById(orgId);
        return ViewModelUtils.createSuccessOrError(deleted, GlobalSuccessEnum.ORGANIZATION_DELETE_SUCCESS, GlobalErrorEnum.ORGANIZATION_DELETE_ERROR);
    }

    @Override
    public AbstractViewModel modifyOrg(OrganizationVO vo) {
        OrganizationPO po = new OrganizationPO();
        BeanUtils.copyProperties(vo, po);
        boolean modified = this.updateById(po);
        return ViewModelUtils.createSuccessOrError(modified, GlobalSuccessEnum.ORGANIZATION_MODIFY_SUCCESS, GlobalErrorEnum.ORGANIZATION_MODIFY_ERROR);
    }
}
