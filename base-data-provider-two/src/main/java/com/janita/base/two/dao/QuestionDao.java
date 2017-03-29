package com.janita.base.two.dao;

import com.janita.cloud.common.entity.Question;

/**
 * Created by Janita on 2017-03-29 14:15
 */
public interface QuestionDao {

    Question getQuestion(Long questionId);
}
