-- This query will create the employeesdb schema database, select it, 
-- create a departments table, add values to it, and create an employees table.

CREATE SCHEMA IF NOT EXISTS `employeesdb`;

USE employeesdb;

CREATE TABLE IF NOT EXISTS `departments` (
  `DEPARTMENT_ID` int NOT NULL,
  `DEPARTMENT_NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`)
);


INSERT INTO `departments` (`DEPARTMENT_ID`, `DEPARTMENT_NAME`) VALUES
('1', 'ACCOUNTING'),
('2', 'HR'),
('3', 'DEVELOPMENT'),
('4', 'SALES');


CREATE TABLE IF NOT EXISTS `employees` (
  `EMPLOYEE_ID` int NOT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  `FIRST_NAME` varchar(50) NOT NULL,
  `DEPARTMENT_ID` int NOT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`),
  FOREIGN KEY(department_id) REFERENCES departments(department_id)
);


