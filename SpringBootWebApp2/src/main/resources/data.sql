insert into student(id, name, email, age) values (101, 'Hank Pym', 'hank@antman.ant', 50);
insert into student(id, name, email, dob, age) values (102, 'Bruce Banner', 'bb@gamma.rays', '13 OCT 1980', 40);
insert into student(id, name, email, dob, age) values (103, 'Hawk Eye', 'arrowGuy77@nevermisses.net', '23 JAN 1977', 43);

INSERT INTO instructor(id, name, dob) values (777, 'Allison, Alester', '1977-11-13');
INSERT INTO instructor(id, name, dob) values (778, 'Master, Shake', '1980-08-03');
INSERT INTO instructor(id, name, dob) values (779, 'Merryweather, May', '1963-07-11');

insert into course(id, name, department, student_id, instructor_id) values (901, 'Western Civilization', 'History', 101, 777);
insert into course(id, name, department, student_id, instructor_id) values (902, 'Machine Learning', 'Computer Science', 102, 778);
insert into course(id, name, department, student_id, instructor_id) values (903, 'Jazzercise', 'Kineseology', 102, 779);
INSERT INTO course(id, name, department, student_id, instructor_id) values (904, 'AI', 'Computer Science', 101, 777);


