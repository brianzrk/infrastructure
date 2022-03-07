package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.UserMessage;
import com.origin.infrastructure.mapper.UserMessageMapper;
import com.origin.infrastructure.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
