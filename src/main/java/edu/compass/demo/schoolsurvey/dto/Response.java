package edu.compass.demo.schoolsurvey.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import java.util.Arrays;

@Entity
@IdClass(ResponseId.class)
public class Response {
    @Id
    private String userId = "user";
    @Id
    private String surveyId;
    @Id
    private String questionId;
    @Id
    private String optionId;

    @Transient
    private String[] optionIds;

    public Response() {
    }

    public Response(String userId, String surveyId, String questionId, String optionId) {
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

    public String[] getOptionIds() {
        return optionIds;
    }

    public void setOptionIds(String[] optionIds) {
        this.optionIds = optionIds;
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

    @Override
    public String toString() {
        return "Response{" +
                "userId='" + userId + '\'' +
                ", optionIds=" + Arrays.toString(optionIds) +
                ", surveyId='" + surveyId + '\'' +
                '}';
    }

}
