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

    @HystrixCommand(fallbackMethod = "getUserFallback",commandProperties =@HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE") )
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userConsumerService.getUser(userId);
    }


    public User getUserFallback(Long userId){
        User user = new User();
        user.setUserId(userId);
        user.setAge(0);
        user.setName("User服务没有启动，这是回调的User");
        return user;
    }
}
