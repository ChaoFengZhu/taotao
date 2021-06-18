package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
public interface TbItemMapper extends BaseMapper<TbItem> {

    TbItem getTbItemById(@Param("id")Long id);
}
