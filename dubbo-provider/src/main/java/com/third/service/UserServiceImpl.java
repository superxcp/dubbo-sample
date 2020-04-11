package com.third.service;

import com.alibaba.dubbo.config.annotation.Service;
import entity.User;
import org.springframework.stereotype.Component;
import service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user=new User();
        user.setName("provider的user");
        user.setAge(1);
        return user;
    }
}
