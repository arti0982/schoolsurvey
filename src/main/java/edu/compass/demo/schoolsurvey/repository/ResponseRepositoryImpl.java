package edu.compass.demo.schoolsurvey.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


public class ResponseRepositoryImpl implements ResponseRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void insertWithQuery(Integer optionId, String userId) {
        try {
            int updated = entityManager.createNativeQuery("INSERT INTO response (OPTION_ID, QUESTION_ID, SURVEY_ID, USER_ID) " +
                    "select o.option_id, o.question_id, q.survey_id, ? from question q, option o where o.question_id=q.question_id AND o.option_id=?")
                    .setParameter(1, userId)
                    .setParameter(2, optionId)
                    .executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
