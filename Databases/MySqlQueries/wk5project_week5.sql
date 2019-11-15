-- This query will create the week5 schema database, select it. 
CREATE SCHEMA IF NOT EXISTS `week5`;
USE week5;

-- Create an employees table.
CREATE TABLE IF NOT EXISTS `employees` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL
);

INSERT INTO  `employees` (`firstName`, `lastName`) VALUES
('Stefan', 'Sternberg'),
('Solon', 'Burleson'),
('Jordan', 'Mao'),
('Thomas', 'White'),
('Malek', 'Ginoswinton'),
('Abigail', 'Rivera'),
('William', 'Rozier');




