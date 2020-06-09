# schoolsurvey app

[Spring Boot](http://projects.spring.io/spring-boot/) app for Recording School surveys

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally
Once you unzip project contents locally, import the project in your favorite IDE as a Maven project (pom.xml)

There are several ways to run a Spring Boot application on your local machine. 
* One way is to execute the `main` method in the `edu.compass.demo.schoolsurvey.SchoolsurveyApplication` class from your IDE.
* Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
* You can also run the Java app from local terminal as
```shell
java -jar target/schoolsurvey-0.0.1-SNAPSHOT.jar
```
* Once started, just go to http://localhost:8080 in Browser and load the app. 

## Testing
Tests are in the class edu.compass.demo.schoolsurvey.SurveyTest

To run tests, select file in IDE and Run Tests, this should execute all the tests

Please ensure that the app is not running while running tests and vice versa and they both share the in-memory H2 DB

## Documentation
* High level Sequence diagram can be found at docs/SchoolSurvey_sequencediagram.jpg
* High level Architecture diagram can be found at docs/SchoolSurvey_Architecture.jpg
* UI Screenshots can be found under docs/screenshots/ directory, filenames are in order prefixed with order number

## Functionality
The survey functionality is built using Spring Boot App with Thymeleaf UI and an in-memory H2 relational Database

The following assumptions were done to limit functionality:
* Only multiple choice questions supported currently, current model can be extended to add free-form text answers
* Basic validation in place to answer at least one question, can be enhanced to answer all survey questions
* Spring security commented out, can be enabled to use Spring Boot user and generated password. 
* For demo purposes, all surveys stored for Default user with Id "user"
* Exception handling is incomplete and needs to be more comprehensive.
* Local H2 Database can be queried and viewed at http://localhost:8080/h2-console/login.jsp with credentials sa/sa
* Survey Data setup scripts are at src/main/resources/data.sql



