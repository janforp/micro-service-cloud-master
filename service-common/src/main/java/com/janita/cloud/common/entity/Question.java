package com.janita.cloud.common.entity;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-29 14:11
 */
public class Question implements Serializable {

    private Long questionId;

    private String content;

    private String remark;

    private Long creatorId;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}
