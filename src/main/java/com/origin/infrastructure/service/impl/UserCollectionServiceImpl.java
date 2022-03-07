package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.UserCollection;
import com.origin.infrastructure.mapper.UserCollectionMapper;
import com.origin.infrastructure.service.UserCollectionService;
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
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

}
