package com.taotao.service.impl;

import com.taotao.service.ITbUserService;
import com.taotao.pojo.TbUser;
import com.taotao.mapper.TbUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
