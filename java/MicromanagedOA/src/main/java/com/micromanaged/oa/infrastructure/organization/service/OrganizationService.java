package com.micromanaged.oa.infrastructure.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.ListViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.organization.dto.OrganizationDTO;
import com.micromanaged.oa.infrastructure.organization.po.OrganizationPO;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationTreeViewVO;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationVO;

public interface OrganizationService extends IService<OrganizationPO> {

    ListViewModel<OrganizationTreeViewVO> getOrgTreeView(final OrganizationDTO dto);

    SingleViewModel<OrganizationVO> addOrg(final OrganizationVO vo);

    AbstractViewModel deleteOrg(final Integer orgId);

    AbstractViewModel modifyOrg(final OrganizationVO vo);
}
