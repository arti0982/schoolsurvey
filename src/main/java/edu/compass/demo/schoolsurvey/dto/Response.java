package edu.compass.demo.schoolsurvey.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import java.util.Arrays;

// Class to Record User Responses
@Entity
@IdClass(ResponseId.class)
public class Response {
    @Id
    private String userId = User.DEFAULT_USER_ID;
    @Id
    private Integer surveyId;
    @Id
    private Integer questionId;
    @Id
    private Integer optionId;

    @Transient
    private Integer[] optionIds;

    public Response() {
    }

    public Response(String userId, int surveyId, int questionId, int optionId) {
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

    public Integer[] getOptionIds() {
        return optionIds;
    }

    public void setOptionIds(Integer[] optionIds) {
        this.optionIds = optionIds;
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

    @Override
    public String toString() {
        return "Response{" +
                "userId='" + userId + '\'' +
                ", optionIds=" + Arrays.toString(optionIds) +
                ", surveyId='" + surveyId + '\'' +
                '}';
    }

}
