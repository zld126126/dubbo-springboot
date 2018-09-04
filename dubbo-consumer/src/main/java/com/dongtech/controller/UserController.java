package com.dongtech.controller;

import com.dongtech.service.UserServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceConsumer service;

    //http://localhost:8081/getAllUserList
    //返回结果[{"username":"A","password":"123456"},{"username":"B","password":"admin"},{"username":"C","password":"123456"}]
    @ResponseBody
    @RequestMapping("/getAllUserList")
    public Object getAllUserList() {
        System.out.print(service.getAllUserList());
        return service.getAllUserList();
    }
}
