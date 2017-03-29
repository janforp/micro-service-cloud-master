package com.janita.base.two.controller;

import com.janita.cloud.common.entity.Question;
import com.janita.cloud.service.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-29 14:13
 */
@RestController
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable("id") Long questionId){
        return questionService.getQuestion(questionId);
    }
}
