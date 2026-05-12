use employee_db;

DROP table users;

CREATE TABLE users(
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users VALUES('admin','1234');

SELECT * FROM users;

-- New DATA students

CREATE TABLE students(
	id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(200)
);

select * from students;