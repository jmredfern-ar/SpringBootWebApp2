insert into student(id, name, email, age) values (101, 'Hank Pym', 'hank@antman.ant', 50);
insert into student(id, name, email, dob, age) values (102, 'Bruce Banner', 'bb@gamma.rays', '13 OCT 1980', 40);
insert into student(id, name, email, dob, age) values (103, 'Hawk Eye', 'arrowGuy77@nevermisses.net', '23 JAN 1977', 43);

INSERT INTO instructor(id, name, dob) values (777, 'Allison, Alester', '1977-11-13');
INSERT INTO instructor(id, name, dob) values (778, 'Master, Shake', '1980-08-03');
INSERT INTO instructor(id, name, dob) values (779, 'Merryweather, May', '1963-07-11');

INSERT INTO course(id, name, department, student_id) VALUES (401, 'Underwater Basket Weaving', 'FACS', 103);
INSERT INTO course(id, name, department, student_id) VALUES (402, 'Introduction to Archery', 'Kinesiology', 103);
INSERT INTO course(id, name, department, student_id) VALUES (403, 'Gamma Ray Theoritics', 'Life Sciences', 102);
INSERT INTO course(id, name, department, student_id) VALUES (404, 'Myrmecology', 'Zoology', 101);

INSERT INTO scholarship(id, name, amount) VALUES (123, 'Tony Stark Memorial STEM', 50000);
INSERT INTO scholarship(id, name, amount) VALUES (124, 'Ultron No Strings On Me World 1', 4000);
INSERT INTO scholarship(id, name, amount) VALUES (125, 'Wandas Visionary Mind Stone Award', 10000);

INSERT INTO advisor(name, department) VALUES ('Mack Mackey', 'Antropology');
INSERT INTO advisor(name, department) VALUES ('Jack Jackey', 'Music');
INSERT INTO advisor(name, department) VALUES ('Geoack Geoackey', 'Astrophysics');

INSERT INTO payment(payment_id, payment_type, payment_amount) VALUES (PAYMENT_SEQ.nextval, 'Tuition', 3000);
INSERT INTO payment(payment_id, payment_type, payment_amount) VALUES (PAYMENT_SEQ.nextval, 'Meal Plan', 450);

INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (101, 123);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (101, 125);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (102, 124);
INSERT INTO student_scholarships(students_id, scholarships_id) VALUES (103, 124);




