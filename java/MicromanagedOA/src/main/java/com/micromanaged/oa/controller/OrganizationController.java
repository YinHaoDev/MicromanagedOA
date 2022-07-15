package com.micromanaged.oa.controller;

import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.ListViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.organization.dto.OrganizationDTO;
import com.micromanaged.oa.infrastructure.organization.service.OrganizationService;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationTreeViewVO;
import com.micromanaged.oa.infrastructure.organization.vo.OrganizationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micromanaged/oa/system/organization")
public class OrganizationController {

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    private final OrganizationService organizationService;

    @ResponseBody
    @PostMapping(value = "/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ListViewModel<OrganizationTreeViewVO>> getOrganizations(@RequestBody OrganizationDTO dto) {
        return new ResponseEntity<>(organizationService.getOrgTreeView(dto), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/edit", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> editOrganization(@RequestBody OrganizationVO vo) {
        return new ResponseEntity<>(organizationService.modifyOrg(vo), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> deleteOrganization(@RequestBody OrganizationDTO dto) {
        return new ResponseEntity<>(organizationService.deleteOrg(dto.getOrgId()), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleViewModel<OrganizationVO>> addOrganization(@RequestBody OrganizationVO vo) {
        return new ResponseEntity<>(organizationService.addOrg(vo), HttpStatus.OK);
    }
}
