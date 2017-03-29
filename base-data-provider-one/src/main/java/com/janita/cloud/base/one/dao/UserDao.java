package com.janita.cloud.base.one.dao;

import com.janita.cloud.common.entity.User;

/**
 * Created by Janita on 2017-03-29 10:15
 */
public interface UserDao {

    User getUserById(Long userId);
}
