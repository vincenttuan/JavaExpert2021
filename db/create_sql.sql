
CREATE TABLE Department (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	name Text
);

INSERT INTO Department('name') VALUES ('Sales');
INSERT INTO Department('name') VALUES ('IT');


CREATE TABLE Employee (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	name Text,
	salary REAL,
	dept_id INTEGER not null,
	CONSTRAINT fk_department  FOREIGN KEY (dept_id)  REFERENCES Department(id)
);

INSERT INTO Employee('name', 'salary', 'dept_id') VALUES ('John', 45000, 1);
INSERT INTO Employee('name', 'salary', 'dept_id') VALUES ('Mary', 38000, 1);
INSERT INTO Employee('name', 'salary', 'dept_id') VALUES ('Bobo', 55000, 2);
INSERT INTO Employee('name', 'salary', 'dept_id') VALUES ('Jane', 32000, 1);
INSERT INTO Employee('name', 'salary', 'dept_id') VALUES ('Helen', 67000, 2);
