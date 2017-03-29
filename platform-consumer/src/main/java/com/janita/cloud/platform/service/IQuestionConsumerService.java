package com.janita.cloud.platform.service;

import com.janita.cloud.common.entity.Question;
import com.janita.cloud.platform.confirguration.FeignConfiguration;
import com.janita.cloud.platform.fallback.QuestionConsumerServiceFallback;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Janita on 2017-03-29 15:11
 */
@FeignClient(name = "base-server",configuration = FeignConfiguration.class,fallback = QuestionConsumerServiceFallback.class)
public interface IQuestionConsumerService {

    @RequestLine("GET /question/{id}")
    @LoadBalanced
    Question getQuestion(@Param("id") Long id);
}
