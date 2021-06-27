insert into student(id, name, email, age) values (101, 'Hank Pym', 'hank@antman.ant', 50);
insert into student(id, name, email, dob, age) values (102, 'Bruce Banner', 'bb@gamma.rays', '13 OCT 1980', 40);
insert into student(id, name, email, dob, age) values (103, 'Hawk Eye', 'arrowGuy77@nevermisses.net', '23 JAN 1977', 43);

INSERT INTO instructor(id, name, dob) values (777, 'Allison, Alester', '1977-11-13');
INSERT INTO instructor(id, name, dob) values (778, 'Master, Shake', '1980-08-03');
INSERT INTO instructor(id, name, dob) values (779, 'Merryweather, May', '1963-07-11');

INSERT INTO scholarship(id, name, amount) VALUES (123, 'Tony Stark Memorial STEM', 50000);
INSERT INTO scholarship(id, name, amount) VALUES (124, 'Ultron No Strings On Me World 1', 4000);
INSERT INTO scholarship(id, name, amount) VALUES (125, 'Wandas Visionary Mind Stone Award', 10000);

INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (101, 123);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (101, 125);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (102, 124);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (103, 124);




