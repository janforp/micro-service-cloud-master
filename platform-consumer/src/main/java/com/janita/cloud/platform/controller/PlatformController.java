package com.janita.cloud.platform.controller;

import com.janita.cloud.common.entity.User;
import com.janita.cloud.platform.service.IUserConsumerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-29 10:37
 */
@RestController
public class PlatformController {

    @Autowired
    private IUserConsumerService userConsumerService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userConsumerService.getUser(userId);
    }
}
