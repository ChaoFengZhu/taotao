package com.taotao.controller;


import com.taotao.service.ITbItemService;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
@RestController
@RequestMapping("/tbItem")
public class TbItemController {
    @Autowired
    ITbItemService iTbItemService;
    @RequestMapping("/getTbItemById/{id}")
    public TbItem getTbItemById(@PathVariable Long id){
       return iTbItemService.getTbItemById(id);
    }

}

