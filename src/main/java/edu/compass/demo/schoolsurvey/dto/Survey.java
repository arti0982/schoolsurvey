package edu.compass.demo.schoolsurvey.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

// Class to store Survey metadata
@Entity
public class Survey {
    @Id
    private Integer surveyId;
    private String surveyName;

    @OneToMany(mappedBy = "survey")
    private List<Question> questions;

    public Survey() {
    }

    public Survey(Integer surveyId, String surveyName, List<Question> questions) {
        super();
        this.surveyId = surveyId;
        this.surveyName = surveyName;
        this.questions = questions;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "surveyId='" + surveyId + '\'' +
                ", surveyName='" + surveyName + '\'' +
                '}';
    }
}
