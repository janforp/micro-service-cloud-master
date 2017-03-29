package com.janita.micro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Janita on 2017-03-29 09:48
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryApplication.class, args);
    }
    
}
