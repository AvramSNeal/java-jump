-- This query will create the week5 schema database, select it. 
CREATE SCHEMA IF NOT EXISTS `week5`;
USE week5;

-- Create an employees table.
CREATE TABLE IF NOT EXISTS `employees` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL
);

-- This is an optional INSERT for employees for Collabera/Cognixia
/*
INSERT INTO  `employees` (`firstName`, `lastName`) VALUES
('Solon', 'Burleson'),
('Avram', 'Neal'),
('Stefan', 'Sternberg'),
('Arianne', 'Hernandez'),
('Jordan', 'Mao'),
('Thomas', 'White'),
('Malik', 'Hampton'),
('William', 'Rozier'),
('Abigail', 'Rivera'),

('Asher', 'Yueh'),
('Kyle', 'Chapman'),
('Carter', 'Gehrke'),
('Bennett', 'Black'),
('Orlando', 'Chavez'),
('Vasile', 'Zazivion'),

('Alejandro', 'Vargas'),
('Robert', 'Stirling'),
('John', 'Truong'),
('Jeremy', 'Yao'),
('James', 'Plaut'),
('Ryan', 'Trotter'),
('Shannon', 'Molina'),
('Oscar', 'Holloway');
*/
-- Query the full list of employees
SELECT * FROM Employees;

