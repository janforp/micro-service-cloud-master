package com.janita.micro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Janita on 2017-03-29 09:58
 * zuul 默认会反向代理 eureka里面的微服务
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGagewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGagewayApplication.class, args);
    }

}
