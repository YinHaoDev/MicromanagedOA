package com.micromanaged.oa.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.dto.BasePageDTO;
import com.micromanaged.oa.infrastructure.position.dto.PositionDTO;
import com.micromanaged.oa.infrastructure.position.service.PositionService;
import com.micromanaged.oa.infrastructure.position.vo.PositionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micromanaged/oa/system/position")
public class PositionController {

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    private final PositionService positionService;

    @ResponseBody
    @PostMapping(value = "/page", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<IPage<PositionVO>> getPositionPage(@RequestBody BasePageDTO<PositionDTO> arg01) {
        return new ResponseEntity<>(positionService.getPositionPage(arg01), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/single")
    public ResponseEntity<AbstractViewModel> getSinglePosition(@RequestBody PositionDTO arg01) {
        return new ResponseEntity<>(positionService.getPositionByID(arg01), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/edit", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> editPosition(@RequestBody PositionVO arg01) {
        return new ResponseEntity<>(positionService.modifyPositionVO(arg01), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> deletePosition(@RequestBody PositionDTO arg01) {
        return new ResponseEntity<>(positionService.deletePositionVO(arg01), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> addPosition(@RequestBody PositionVO arg01) {
        return new ResponseEntity<>(positionService.addPositionVO(arg01), HttpStatus.OK);
    }
}
