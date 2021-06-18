package com.taotao.service.impl;

import com.taotao.service.ITbItemDescService;
import com.taotao.pojo.TbItemDesc;
import com.taotao.mapper.TbItemDescMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品描述表 服务实现类
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
@Service
public class TbItemDescServiceImpl extends ServiceImpl<TbItemDescMapper, TbItemDesc> implements ITbItemDescService {

}
