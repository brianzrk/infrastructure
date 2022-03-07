package com.origin.infrastructure.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.origin.infrastructure.entity.User;
import com.origin.infrastructure.mapper.UserMapper;
import com.origin.infrastructure.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        return users;
    }

}
