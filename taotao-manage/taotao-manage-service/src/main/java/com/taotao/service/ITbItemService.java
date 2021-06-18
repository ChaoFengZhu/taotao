package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
public interface ITbItemService extends IService<TbItem> {

    TbItem getTbItemById(Long id);
}
