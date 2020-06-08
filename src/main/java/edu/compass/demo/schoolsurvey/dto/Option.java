package edu.compass.demo.schoolsurvey.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// Class to store Options for a Question
@Entity
public class Option {
    @Id
    private Integer optionId;
    private String optionText;

    public Option() {
    }

    public Option(Integer optionId, String optionText) {
        super();
        this.optionId = optionId;
        this.optionText = optionText;
    }

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Option{" +
                "optionId='" + optionId + '\'' +
                ", optionText='" + optionText + '\'' +
                '}';
    }
}
