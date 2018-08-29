package com.dongtech.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dongtech.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 * Created by Jaycekon on 20/09/2017.
 */
@Component
public class UserServiceConsumer {

    @Reference
    UserService userService;

    public List<User> getAllUserList() {
        return userService.getAllUserList();
    }
}
