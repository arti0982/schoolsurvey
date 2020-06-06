INSERT INTO SURVEY(SURVEY_ID, SURVEY_NAME) VALUES ('1', 'Survey 1');
INSERT INTO SURVEY(SURVEY_ID, SURVEY_NAME) VALUES ('2', 'Survey 2');

insert into question(question_id, title, survey_id) values('1', 'What operating system do you use', '1');
insert into question(question_id, title, survey_id) values('2', 'Which county do you live in', '1');


insert into question(question_id, title, survey_id) values('3', 'What is your favorite subject', '2');
insert into question(question_id, title, survey_id) values('4', 'What is your favorite color', '2');

insert into option(option_id, option_text, question_id) values ('1', 'Windows', '1');
insert into option(option_id, option_text, question_id) values ('2', 'Mac', '1');

insert into option(option_id, option_text, question_id) values ('3', 'Australia', '2');
insert into option(option_id, option_text, question_id) values ('4', 'Ireland', '2');

insert into option(option_id, option_text, question_id) values ('5', 'Mathematics', '3');
insert into option(option_id, option_text, question_id) values ('6', 'History', '3');

insert into option(option_id, option_text, question_id) values ('7', 'Green', '4');
insert into option(option_id, option_text, question_id) values ('8', 'Red', '4');


