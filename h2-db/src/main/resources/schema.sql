Drop TABLE IF EXISTS Student;
CREATE TABLE Student(
slno INT PRIMARY KEY,
sname VARCHAR(50) NOT NULL,
age INT,
mail VARCHAR(50)
);

Drop TABLE IF EXISTS Employee;
CREATE TABLE Employee(
empid INT PRIMARY KEY,
ename VARCHAR(50) NOT NULL,
job VARCHAR(50),
salary INT
);