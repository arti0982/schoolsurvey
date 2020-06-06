package edu.compass.demo.schoolsurvey.service;

import edu.compass.demo.schoolsurvey.dto.Survey;
import edu.compass.demo.schoolsurvey.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> getAllSurveys() {
        List<Survey> surveys = new ArrayList<>();
        surveyRepository.findAll().forEach(surveys::add);
        return surveys;
    }

    public Survey findById(String surveyId) throws Exception {
        Survey survey = surveyRepository.findById(surveyId).orElse(null);
        if (survey == null) {
            throw new Exception("Cannot find Survey with surveyId: " + surveyId);
        } else return survey;
    }


    public void addSurvey(Survey survey) {
        surveyRepository.save(survey);
    }
}
