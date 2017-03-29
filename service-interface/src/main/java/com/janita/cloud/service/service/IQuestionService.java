package com.janita.cloud.service.service;

import com.janita.cloud.common.entity.Question;

/**
 * Created by Janita on 2017-03-29 14:12
 */
public interface IQuestionService {

    Question getQuestion(Long questionId);
}
