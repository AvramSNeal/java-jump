-- AGGREGATE FUNCTIONS:
-- return a value after performing a calculation on a set of values

use sakila;


# COUNT
-- return the number of rows that match the given criteria

select * from city;

select count(city_id)
from city
where city like 'f%';

-- select * from city where city like 'f%';


# MAX
-- selects the max value in a column

select max(rental_rate) from film;

-- error: parameter should be a column from a table
-- select max(1, 2, 3) from dual;

select 2*5 from dual;


# MIN
-- selects the min value in a column

select min(rental_rate) from film;


# AVG
-- returns the average value of a column, numeric
select avg(rental_rate) from film;


# SUM
-- returns the sum the column, numeric
select sum(rental_rate) from film;
