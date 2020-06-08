package edu.compass.demo.schoolsurvey.controller;

import edu.compass.demo.schoolsurvey.dto.Response;
import edu.compass.demo.schoolsurvey.dto.Survey;
import edu.compass.demo.schoolsurvey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

//Controller class for all actions
@Controller
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    //this method gets all surveys that the user hasnt filled out yet
    @GetMapping(value = {"/", "/index", "/surveys"})
    public String getAllSurveys(Model model) {
        model.addAttribute("title", "Survey List");
        model.addAttribute("surveys", surveyService.getAllSurveys());
        return "index";
    }

    @GetMapping(value = "/surveys/{surveyId}")
    public String getSurveyById(Model model, @PathVariable Integer surveyId) {
        Survey survey = null;
        try {
            survey = surveyService.findById(surveyId);
        } catch (Exception ex) {
            model.addAttribute("errorMessage", "Survey details not found");
        }
        model.addAttribute("response", new Response());
        model.addAttribute("survey", survey);
        return "survey";
    }

    @PostMapping(value = "/responses")
    public String submitResponse(Model model, @ModelAttribute("response") Response response, BindingResult bindingResult) {
        try {
//            if (bindingResult.hasErrors()) {
//                return "index";
//            }

            if (response.getOptionIds() != null && response.getOptionIds().length > 0) {
                Arrays.stream(response.getOptionIds()).forEach(optionId -> surveyService.submitSurveyResponse(optionId));
            } else {
                model.addAttribute("errors","Please answer at least one question to complete the survey.");
                return getSurveyById(model, response.getSurveyId());
            }

            return "thankyou";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "index";
        }
    }
}
