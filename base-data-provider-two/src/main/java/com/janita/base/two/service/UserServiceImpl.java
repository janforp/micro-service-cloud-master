package com.janita.base.two.service;

import com.janita.base.two.dao.UserDao;
import com.janita.cloud.common.entity.User;
import com.janita.cloud.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-29 10:14
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long userId) {
        System.out.println("*******"+"调用了provider-Two");
        return userDao.getUserById(userId);
    }
}
