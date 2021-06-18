package com.taotao.service.impl;

import com.taotao.service.ITbOrderItemService;
import com.taotao.pojo.TbOrderItem;
import com.taotao.mapper.TbOrderItemMapper;
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
public class TbOrderItemServiceImpl extends ServiceImpl<TbOrderItemMapper, TbOrderItem> implements ITbOrderItemService {

}
