package edu.compass.demo.schoolsurvey.repository;

import edu.compass.demo.schoolsurvey.dto.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ResponseRepository extends CrudRepository<Response, String>, ResponseRepositoryCustom {
    //    @Query(value = "select distinct survey_Id, q.question_Id from question q, option o "+
//            " where o.option_Id in :option_Ids and o.question_id=q.question_id",
//            nativeQuery = true)
//    Response findResponseDetailsByOptionId(@Param("option_Id") String optionId);
    Response getResponseDataByOptionId(@Param("option_Id") String option_Id);
}



