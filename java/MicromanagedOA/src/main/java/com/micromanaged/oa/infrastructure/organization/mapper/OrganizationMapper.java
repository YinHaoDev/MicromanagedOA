package com.micromanaged.oa.infrastructure.organization.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micromanaged.oa.infrastructure.organization.po.OrganizationPO;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationTreeViewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapper extends BaseMapper<OrganizationPO> {

    List<OrganizationTreeViewVO> selectOrganizationTreeView(String orgName, Integer orgStatus);

    Integer insertOrganizationPO(OrganizationPO po);
}
