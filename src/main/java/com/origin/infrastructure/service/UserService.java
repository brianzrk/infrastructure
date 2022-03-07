package com.origin.infrastructure.service;

import com.origin.infrastructure.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
public interface UserService extends IService<User> {

    List<User> list();
    }
