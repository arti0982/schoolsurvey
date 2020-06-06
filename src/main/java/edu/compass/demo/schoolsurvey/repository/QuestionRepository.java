package edu.compass.demo.schoolsurvey.repository;

import edu.compass.demo.schoolsurvey.dto.Question;
import edu.compass.demo.schoolsurvey.dto.Survey;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, String> {
}
