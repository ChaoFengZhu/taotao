package com.taotao.service.impl;

import com.taotao.service.ITbItemService;
import com.taotao.pojo.TbItem;
import com.taotao.mapper.TbItemMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
@Service
public class TbItemServiceImpl extends ServiceImpl<TbItemMapper, TbItem> implements ITbItemService {
    @Autowired
    TbItemMapper tbItemMapper;
    @Override
    public TbItem getTbItemById(Long id) {
        return  tbItemMapper.getTbItemById( id);
    }
}
