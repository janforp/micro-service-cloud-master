package com.janita.cloud.platform.controller;

import com.janita.cloud.common.entity.Question;
import com.janita.cloud.platform.service.IQuestionConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-29 15:11
 */
@RestController
public class QuestionController {

    @Autowired
    private IQuestionConsumerService questionConsumerService;

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable("id") Long id){
        return questionConsumerService.getQuestion(id);
    }
}
