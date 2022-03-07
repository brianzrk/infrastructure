package com.origin.infrastructure.controller;


import com.origin.infrastructure.entity.User;
import com.origin.infrastructure.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        List<User> users = userService.list();
        return users;
    }

}
