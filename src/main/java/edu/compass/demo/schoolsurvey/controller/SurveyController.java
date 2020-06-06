package edu.compass.demo.schoolsurvey.controller;

import edu.compass.demo.schoolsurvey.dto.Response;
import edu.compass.demo.schoolsurvey.dto.Survey;
import edu.compass.demo.schoolsurvey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @GetMapping(value = {"/", "/index", "/surveys"})
    public String index(Model model) {
        model.addAttribute("title", "Survey List");
        model.addAttribute("surveys", surveyService.getAllSurveys());
        return "index";
    }

    @GetMapping(value = "/surveys/{surveyId}")
    public String getSurveyById(Model model, @PathVariable String surveyId) {
        Survey survey = null;
        try {
            survey = surveyService.findById(surveyId);
        } catch (Exception ex) {
            model.addAttribute("errorMessage", "Contact not found");
        }
        model.addAttribute("response", new Response());
        model.addAttribute("survey", survey);
        return "survey";
    }

    @PostMapping(value = "/responses")
    public String addResponse(Model model, @ModelAttribute("response") Response response) {
        try {
//            Contact newContact = contactService.save(contact);
            return "";
        } catch (Exception ex) {
//            // log exception first,
//            // then show error
//            String errorMessage = ex.getMessage();
//            logger.error(errorMessage);
//            model.addAttribute("errorMessage", errorMessage);
//
//            //model.addAttribute("contact", contact);
//            model.addAttribute("add", true);
            return "contact-edit";
        }
    }


    @RequestMapping(method = RequestMethod.POST, value = "/surveys")
    public Boolean addSurvey(@RequestBody Survey survey) {
        surveyService.addSurvey(survey);
        return true;
    }
}
