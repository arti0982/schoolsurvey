package edu.compass.demo.schoolsurvey.dto;

import java.io.Serializable;

public class ResponseId implements Serializable {
    private String userId = "user";
    private String surveyId;
    private String questionId;
    private String optionId;

    public ResponseId() {
    }

    public ResponseId(String userId, String surveyId, String questionId, String optionId) {
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

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }
}
