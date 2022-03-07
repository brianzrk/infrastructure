package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.Comment;
import com.origin.infrastructure.mapper.CommentMapper;
import com.origin.infrastructure.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
