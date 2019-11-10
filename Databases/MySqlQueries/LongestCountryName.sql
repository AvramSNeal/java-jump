SELECT region_name, MAX(country_name) FROM regions
NATURAL JOIN countries
GROUP BY region_id
ORDER BY region_name;

