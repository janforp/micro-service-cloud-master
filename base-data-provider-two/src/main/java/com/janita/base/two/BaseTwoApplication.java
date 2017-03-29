package com.janita.base.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Janita on 2017-03-29 10:13
 */
@SpringBootApplication
@EnableEurekaClient
public class BaseTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseTwoApplication.class, args);
    }

}
