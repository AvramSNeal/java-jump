-- This part of the query will get the region names with the longest country names, but only by chance i.e. max(country_name) get's the last country lexicographically.
USE hrdb;
SELECT region_name, MAX(country_name) FROM regions
NATURAL JOIN countries
GROUP BY region_id
ORDER BY region_name;

-- This part of the query will get the region names with the longest country names through specifying the max() of the length() of country_name
USE hrdb;
SELECT region_name, country_name FROM regions r NATURAL JOIN countries c
WHERE country_name = (
		SELECT country_name FROM countries c
		WHERE c.region_id = r.region_id AND 
        length(c.country_name) = (SELECT max(length(c.country_name)))
        ORDER BY length(c.country_name) DESC LIMIT 1)
ORDER BY region_name;

-- This part of the query will get the region names with the longest country names by getting the last/longest name in order from each region
USE hrdb;
SELECT region_name, country_name FROM regions r NATURAL JOIN countries c
WHERE country_name = 
		(SELECT country_name FROM countries c 
        WHERE c.region_id = r.region_id 
        ORDER BY length(c.country_name) DESC LIMIT 1)
ORDER BY region_name;