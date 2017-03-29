package com.janita.cloud.base.one.dao.impl;

import com.janita.cloud.base.one.dao.UserDao;
import com.janita.cloud.common.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-29 10:16
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User getUserById(Long userId) {
        User user = new User();
        user.setAge(10001);
        user.setUserId(userId);
        user.setName("来自Base-One的User");
        return user;
    }
}
