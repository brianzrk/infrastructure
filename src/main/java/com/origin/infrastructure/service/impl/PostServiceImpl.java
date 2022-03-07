package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.Post;
import com.origin.infrastructure.mapper.PostMapper;
import com.origin.infrastructure.service.PostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
