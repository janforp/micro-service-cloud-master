package com.janita.cloud.platform.confirguration;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017-03-29 10:35
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
