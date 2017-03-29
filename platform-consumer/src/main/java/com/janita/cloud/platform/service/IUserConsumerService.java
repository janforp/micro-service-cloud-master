package com.janita.cloud.platform.service;

import com.janita.cloud.common.entity.User;
import com.janita.cloud.platform.confirguration.FeignConfiguration;
import com.janita.cloud.platform.fallback.UserConsumerServiceFallback;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Janita on 2017-03-29 10:47
 * 此处调用服务名称为base-service上面的服务
 */
@FeignClient(name = "base-server",configuration = FeignConfiguration.class,fallback = UserConsumerServiceFallback.class)
public interface IUserConsumerService {

    /**
     * 因为在zuul上注册了两个相同名称的服务：base-server
     * 此处会使用负载均衡的策略调用这两个服务
     * @param id
     * @return
     */
    @RequestLine("GET /user/{id}")
    @LoadBalanced
    User getUser(@Param("id") Long id);
}
