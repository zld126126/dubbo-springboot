package com.dongtech.service;

import com.dongtech.model.User;

import java.util.List;

public interface UserService{
    /**
     * 获取所有用户
     * @return
     */
    public List<User> getAllUserList();
}