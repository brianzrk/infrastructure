package com.origin.infrastructure.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.origin.infrastructure.service.*;
import com.origin.infrastructure.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    @Autowired
    UserService userService;

    @Autowired
    UserMessageService messageService;

    @Autowired
    UserCollectionService collectionService;

    @Autowired
    CategoryService categoryService;

//    @Autowired
//    WsService wsService;
//
//    @Autowired
//    SearchService searchService;
//
//    @Autowired
//    AmqpTemplate amqpTemplate;
//
//    @Autowired
//    ChatService chatService;

    public Page<?> getPage(Integer page, Integer size) {
        if (page == null || page == 0) {
            page = 1;
        }
        if (size == null || size == 0) {
            size = 5;
        }
        return new Page<>(page, size);
    }

    protected AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

    protected String getProfileId() {
        return getProfile().getId();
    }

}
