package edu.compass.demo.schoolsurvey.dto;

import java.util.List;

public class Response {
    private String userId = "user";
    private List<Question> questions;
    private String[] optionIds;

    public Response(){

    }

    public Response(String userId, List<Question> questions,  String[] optionIds) {
        this.userId = userId;
        this.questions = questions;
        this.optionIds = optionIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String[] getOptionIds() {
        return optionIds;
    }

    public void setOptionIds(String[] optionIds) {
        this.optionIds = optionIds;
    }
}
