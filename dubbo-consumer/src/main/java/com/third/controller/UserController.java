package com.third.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/consumer")
    public User getUsers(){
        return userService.getUser();
    }
}
