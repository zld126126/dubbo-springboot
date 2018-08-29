package com.dongtech.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dongtech.mapper.UserMapper;
import com.dongtech.model.User;
import com.dongtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUserList() {
        System.out.print(userMapper.selectAllUser());
        return userMapper.selectAllUser();
    }
}
