--Data setup Scripts
INSERT INTO SURVEY(SURVEY_ID, SURVEY_NAME) VALUES ('1', 'Student Satisfaction Survey');
INSERT INTO SURVEY(SURVEY_ID, SURVEY_NAME) VALUES ('2', 'Parent Survey');
INSERT INTO SURVEY(SURVEY_ID, SURVEY_NAME) VALUES ('3', 'Faculty Satisfaction Survey');

insert into question(question_id, title, survey_id) values('1', 'How well do professors teach at the university?', '1');
insert into question(question_id, title, survey_id) values('2', 'How well maintained are the facilities at this university?', '1');
insert into question(question_id, title, survey_id) values('3', 'How helpful is your academic advisor?', '1');


insert into question(question_id, title, survey_id) values('4', 'How often do you meet the teachers in your child''s school?', '2');
insert into question(question_id, title, survey_id) values('5', 'In the past year how often have you discussed your chil''s school with other parents?', '2');
insert into question(question_id, title, survey_id) values('6', 'How satisfied are you with the resources available at that this university for teaching?', '2');

insert into question(question_id, title, survey_id) values('7', 'How satisfied are you with the policies that this university sets?', '3');
insert into question(question_id, title, survey_id) values('8', 'How satisfied are you with the compensation package at this university?', '3');
insert into question(question_id, title, survey_id) values('9', 'How often have you helped out at your child''s school?', '3');


insert into option(option_id, option_text, question_id) values ('1', 'Extremely Effective', '1');
insert into option(option_id, option_text, question_id) values ('2', 'Very Effective', '1');
insert into option(option_id, option_text, question_id) values ('3', 'Not so Effective', '1');
insert into option(option_id, option_text, question_id) values ('4', 'Not at all Effective', '1');
insert into option(option_id, option_text, question_id) values ('5', 'Somewhat Effective', '1');

insert into option(option_id, option_text, question_id) values ('6', 'Extremely well-maintained', '2');
insert into option(option_id, option_text, question_id) values ('7', 'Very well well-maintained', '2');
insert into option(option_id, option_text, question_id) values ('8', 'Not so well-maintained', '2');
insert into option(option_id, option_text, question_id) values ('9', 'Not at all well-maintained', '2');
insert into option(option_id, option_text, question_id) values ('10', 'Somewhat well-maintained', '2');


insert into option(option_id, option_text, question_id) values ('11', 'Extremely helpful', '3');
insert into option(option_id, option_text, question_id) values ('12', 'Very helpful', '3');
insert into option(option_id, option_text, question_id) values ('13', 'Not so helpful', '3');
insert into option(option_id, option_text, question_id) values ('14', 'Not at all helpful', '3');
insert into option(option_id, option_text, question_id) values ('15', 'Somewhat helpful', '3');


insert into option(option_id, option_text, question_id) values ('16', 'Almost never', '4');
insert into option(option_id, option_text, question_id) values ('17', 'Monthly', '4');
insert into option(option_id, option_text, question_id) values ('18', 'Once or twice per year', '4');
insert into option(option_id, option_text, question_id) values ('19', 'Weekly or more', '4');
insert into option(option_id, option_text, question_id) values ('20', 'Every few months', '4');

insert into option(option_id, option_text, question_id) values ('21', 'Almost never', '5');
insert into option(option_id, option_text, question_id) values ('22', 'Monthly', '5');
insert into option(option_id, option_text, question_id) values ('23', 'Once or twice per year', '5');
insert into option(option_id, option_text, question_id) values ('24', 'Weekly or more', '5');
insert into option(option_id, option_text, question_id) values ('25', 'Every few months', '5');

insert into option(option_id, option_text, question_id) values ('26', 'Almost never', '6');
insert into option(option_id, option_text, question_id) values ('27', 'Monthly', '6');
insert into option(option_id, option_text, question_id) values ('28', 'Once or twice per year', '6');
insert into option(option_id, option_text, question_id) values ('29', 'Weekly or more', '6');
insert into option(option_id, option_text, question_id) values ('30', 'Every few months', '6');

insert into option(option_id, option_text, question_id) values ('31', 'Extremely satisfied', '7');
insert into option(option_id, option_text, question_id) values ('32', 'Very satisfied', '7');
insert into option(option_id, option_text, question_id) values ('33', 'Not so satisfied', '7');
insert into option(option_id, option_text, question_id) values ('34', 'Not at all satisfied', '7');
insert into option(option_id, option_text, question_id) values ('35', 'Somewhat satisfied', '7');

insert into option(option_id, option_text, question_id) values ('36', 'Extremely satisfied', '8');
insert into option(option_id, option_text, question_id) values ('37', 'Very satisfied', '8');
insert into option(option_id, option_text, question_id) values ('38', 'Not so satisfied', '8');
insert into option(option_id, option_text, question_id) values ('39', 'Not at all satisfied', '8');
insert into option(option_id, option_text, question_id) values ('40', 'Somewhat satisfied', '8');

insert into option(option_id, option_text, question_id) values ('41', 'Extremely satisfied', '9');
insert into option(option_id, option_text, question_id) values ('42', 'Very satisfied', '9');
insert into option(option_id, option_text, question_id) values ('43', 'Not so satisfied', '9');
insert into option(option_id, option_text, question_id) values ('44', 'Not at all satisfied', '9');
insert into option(option_id, option_text, question_id) values ('45', 'Somewhat satisfied', '9');