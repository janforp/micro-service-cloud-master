package com.janita.base.two.service;

import com.janita.base.two.dao.QuestionDao;
import com.janita.cloud.common.entity.Question;
import com.janita.cloud.service.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-29 14:15
 */
@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public Question getQuestion(Long questionId) {
        return questionDao.getQuestion(questionId);
    }
}
