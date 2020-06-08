package edu.compass.demo.schoolsurvey.repository;

import edu.compass.demo.schoolsurvey.dto.Survey;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {
    @Query(value = "SELECT * FROM SURVEY WHERE SURVEY_ID NOT IN (SELECT DISTINCT SURVEY_ID FROM RESPONSE)", nativeQuery = true)
    Collection<Survey> findAllNewSurveys();


}
