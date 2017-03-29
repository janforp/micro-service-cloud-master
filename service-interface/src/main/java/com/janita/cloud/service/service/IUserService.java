package com.janita.cloud.service.service;

import com.janita.cloud.common.entity.User;

/**
 * Created by Janita on 2017-03-29 10:12
 */
public interface IUserService {

    User getUserById(Long userId);
}
