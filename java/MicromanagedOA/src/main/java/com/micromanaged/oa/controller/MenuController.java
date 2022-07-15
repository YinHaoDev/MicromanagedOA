package com.micromanaged.oa.controller;

import com.micromanaged.oa.infrastructure.common.AbstractViewModel;
import com.micromanaged.oa.infrastructure.common.ListViewModel;
import com.micromanaged.oa.infrastructure.common.SingleViewModel;
import com.micromanaged.oa.infrastructure.menu.dto.MenuDTO;
import com.micromanaged.oa.infrastructure.menu.service.MenuService;
import com.micromanaged.oa.infrastructure.menu.vo.MenuTreeViewVO;
import com.micromanaged.oa.infrastructure.menu.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micromanaged/oa/system/menu")
public class MenuController {

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    private final MenuService menuService;

    @ResponseBody
    @PostMapping(value = "/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ListViewModel<MenuTreeViewVO>> getMenus(@RequestBody MenuDTO dto) {
        return new ResponseEntity<>(menuService.getMenuTreeView(dto), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/edit", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> editMenu(@RequestBody MenuVO vo) {
        return new ResponseEntity<>(menuService.modifyMenu(vo), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AbstractViewModel> deleteMenu(@RequestBody MenuDTO dto) {
        return new ResponseEntity<>(menuService.deleteMenu(dto), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleViewModel<MenuVO>> addMenu(@RequestBody MenuVO vo) {
        return new ResponseEntity<>(menuService.addMenu(vo), HttpStatus.OK);
    }
}
