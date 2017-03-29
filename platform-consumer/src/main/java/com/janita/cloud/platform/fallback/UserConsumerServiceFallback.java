package com.janita.cloud.platform.fallback;

import com.janita.cloud.common.entity.User;
import com.janita.cloud.platform.service.IUserConsumerService;
import org.springframework.stereotype.Component;

/**
 * Created by Janita on 2017-03-29 13:30
 */
@Component
public class UserConsumerServiceFallback implements IUserConsumerService {

    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setUserId(id);
        user.setAge(0);
        user.setName("User服务没有启动，这是回调的User");
        System.out.println("*******"+"调用了失败回调提供的User");
        return user;
    }
}
