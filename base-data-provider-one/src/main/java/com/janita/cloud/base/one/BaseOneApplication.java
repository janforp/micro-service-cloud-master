package com.janita.cloud.base.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Janita on 2017-03-29 10:13
 */
@SpringBootApplication
@EnableEurekaClient
public class BaseOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseOneApplication.class, args);
    }

}
