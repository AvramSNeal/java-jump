DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `findCity` (IN city_name VARCHAR(35))
BEGIN
	SELECT * FROM CITY
    WHERE name LIKE CONCAT(city_name, '%');
END$$
DELIMITER ;

SET @your_city ='Pi';
SET @city_name = 'Mi';
CALL findCity(@city_name);