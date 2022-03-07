package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.UserAction;
import com.origin.infrastructure.mapper.UserActionMapper;
import com.origin.infrastructure.service.UserActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
@Service
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {

}
