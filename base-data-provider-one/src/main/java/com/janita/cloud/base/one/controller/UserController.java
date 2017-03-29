package com.janita.cloud.base.one.controller;

import com.janita.cloud.common.entity.User;
import com.janita.cloud.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-29 10:17
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

}
