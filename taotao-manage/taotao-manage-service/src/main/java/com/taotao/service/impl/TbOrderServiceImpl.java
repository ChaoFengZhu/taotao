package com.taotao.service.impl;

import com.taotao.service.ITbOrderService;
import com.taotao.pojo.TbOrder;
import com.taotao.mapper.TbOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
@Service
public class TbOrderServiceImpl extends ServiceImpl<TbOrderMapper, TbOrder> implements ITbOrderService {

}
