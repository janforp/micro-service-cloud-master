package com.janita.cloud.base.one.dao.impl;

import com.janita.cloud.base.one.dao.QuestionDao;
import com.janita.cloud.common.entity.Question;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-29 14:15
 */
@Repository
public class QuestionDaoImpl implements QuestionDao{

    @Override
    public Question getQuestion(Long questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setContent("One-Question");
        return question;
    }
}
