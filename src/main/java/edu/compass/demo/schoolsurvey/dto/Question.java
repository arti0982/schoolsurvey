package edu.compass.demo.schoolsurvey.dto;

import javax.persistence.*;
import java.util.List;

// Class to store Question metadata
@Entity
public class Question {
    @Id
    private Integer questionId;

    @Column(nullable = true)
    private String createdBy;

    private String title;

    @Column(nullable = true)
    private String subTitle;

    @Column(nullable = true)
    private Integer questionType;

    @ManyToOne
    @JoinColumn(name="surveyId")
    private Survey survey;

    @OneToMany(mappedBy = "question")
    private List<Option> options;

    public Question() {
    }

    public Question(Integer questionId, String title, List<Option> options) {
        super();
        this.questionId = questionId;
//        this.createdBy = createdBy;
        this.title = title;
//        this.subTitle = subTitle;
//        this.questionType = questionType;
        this.options = options;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", questionType=" + questionType +
                '}';
    }
}
