package edu.compass.demo.schoolsurvey.repository;

import edu.compass.demo.schoolsurvey.dto.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ResponseRepository extends CrudRepository<Response, String>, ResponseRepositoryCustom {
    Response getResponseDataByOptionId(@Param("option_Id") String option_Id);
}



