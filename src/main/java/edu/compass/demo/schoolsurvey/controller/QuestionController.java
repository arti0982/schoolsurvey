package edu.compass.demo.schoolsurvey.controller;

import edu.compass.demo.schoolsurvey.dto.Survey;
import edu.compass.demo.schoolsurvey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private SurveyService surveyService;
//    @RequestMapping(value = "/surveys/{id}/questions")
//    public List<Survey> getAllSurveys()
//    {
//        return surveyService.getAllSurveys();
//    }

//    @RequestMapping(method= RequestMethod.POST, value="/surveys")
//    public Boolean addSurvey(@RequestBody Survey survey)
//    {
//        surveyService.addSurvey(survey);
//        return true;
//    }
}
