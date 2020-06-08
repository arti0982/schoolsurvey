package edu.compass.demo.schoolsurvey;

import edu.compass.demo.schoolsurvey.dto.Survey;
import edu.compass.demo.schoolsurvey.repository.ResponseRepository;
import edu.compass.demo.schoolsurvey.repository.SurveyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class SurveyTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private ResponseRepository responseRepository;

    public static String DEFAULT_TEST_USER = "testUser";
    @Test
    public void testGetAllSurveys() {
        Collection<Survey> allSurveys = surveyRepository.findAllNewSurveys(DEFAULT_TEST_USER);
        assertThat(allSurveys).isNotNull();
        assertThat(allSurveys).size().isEqualTo(3);
    }

    @Test
    public void testFindSurveyById() {
        Survey survey = surveyRepository.findById(2).orElse(null);
        assertThat(survey).isNotNull();
        assertThat(survey.getQuestions()).isNotEmpty();;
        assertThat(survey.getQuestions().size()).isEqualTo(3);
        assertThat(survey.getQuestions().get(0).getOptions()).isNotEmpty();
        assertThat(survey.getQuestions().get(0).getOptions().size()).isEqualTo(5);
    }

    @Test
    public void testSubmitSurveyResponse() {
        responseRepository.insertWithQuery(3, DEFAULT_TEST_USER);
        Collection<Survey> allSurveys = surveyRepository.findAllNewSurveys(DEFAULT_TEST_USER);
        assertThat(allSurveys).isNotNull();
        assertThat(allSurveys).size().isEqualTo(2);
    }
}
