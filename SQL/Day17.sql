use employee_db;

DROP table users;

CREATE TABLE users(
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users VALUES('admin','1234');

SELECT * FROM users;

-- New DATA employee

CREATE TABLE employee(
	id INT PRIMARY KEY,
    name VARCHAR(80),
    department VARCHAR(50),
    salary DOUBLE
);

Select * from employee;