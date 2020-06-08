package edu.compass.demo.schoolsurvey.dto;

import java.io.Serializable;

// Composite ID class
public class ResponseId implements Serializable {
    private String userId = "user";
    private Integer surveyId;
    private Integer questionId;
    private Integer optionId;

    public ResponseId() {
    }

    public ResponseId(String userId, Integer surveyId, Integer questionId, Integer optionId) {
        this.userId = userId;
        this.surveyId = surveyId;
        this.questionId = questionId;
        this.optionId = optionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }
}
