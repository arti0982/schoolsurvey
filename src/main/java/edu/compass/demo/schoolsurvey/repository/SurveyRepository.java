package edu.compass.demo.schoolsurvey.repository;

import edu.compass.demo.schoolsurvey.dto.Survey;
import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, String> {
}
