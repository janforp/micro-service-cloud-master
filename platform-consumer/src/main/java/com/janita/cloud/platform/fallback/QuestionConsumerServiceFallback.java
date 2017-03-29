package com.janita.cloud.platform.fallback;

import com.janita.cloud.common.entity.Question;
import com.janita.cloud.platform.service.IQuestionConsumerService;
import org.springframework.stereotype.Component;

/**
 * Created by Janita on 2017-03-29 16:57
 */
@Component
public class QuestionConsumerServiceFallback implements IQuestionConsumerService {

    @Override
    public Question getQuestion(Long id) {
        Question question = new Question();
        question.setQuestionId(id);
        question.setContent("base-server服务没有启动，这是失败回调");
        return question;
    }
}
