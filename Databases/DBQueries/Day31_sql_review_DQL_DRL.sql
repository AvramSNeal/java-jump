-- Data Query/Retrieval Language (DQL/DRL):
-- select statements can be useful for:
-- 1. Projection = choose the columns in the table you want
-- 2. Selection  = choose which rows are retrieved in a table
-- 3. Joining 	 = bring together data stored in different tables

use sakila;

# SELECT COMMAND

-- select all columns from a table
select * from actor;

-- select distinct columns from the table
select first_name, last_name, actor_id from actor;

# ARITHMETIC EXPRESSIONS

select actor_id + 1000, first_name from actor;

select * from actor;

# COLUMN ALIASES

-- instead of having the arithmetic expression, set a better column name
-- the makes sense to the person viewing the table
select actor_id + 1000 as 'id', first_name from actor;

select * from film;
select title, rental_rate, replacement_cost, rental_rate * 3 as 'late_fee' from film;


# DISTINCT

-- used to eliminate any duplicate records so only unique records are shown

select * from address;
select distinct district from address;
select distinct district, postal_code from address order by district;

# WHERE

-- where clause is used to select certain rows based on a condition
-- it can be used  ehrn foinh updates or deletes
select * from film where rental_rate = 0.99;


# ORDER BY

-- sorts by ascending or decending order of the column we specify
-- defaults to ascending order if not specified

# ascending
select * from customer order by last_name;
select * from customer order by last_name asc;

# descending
select * from customer order by last_name;
select * from customer order by customer_id desc;


# GROUP BY

-- group by is used to group together rows in a table
-- not selecting individual rows, but groups of rows

select * from film_actor;

select film_id, count(actor_id) as 'actors'
from film_actor 
group by film_id;


# HAVING

-- allows you to specify conditions in a group of statements just like you would with the where clause
select film_id, count(actor_id) as 'actors'
from film_actor 
group by film_id
having count(actor_id) = 10;

# LOGICAL CONDITIONS

-- AND --
select title, rental_rate, rating
from film
where rental_rate = 0.99 and rating = 'PG';

-- OR --
select title, rental_rate, rating
from film
where rental_rate = 0.99 or rating = 'PG';

-- NOT --
select title, rental_rate, rating
from film
where not rating = 'R';


# COMPARISON OPERATOR

-- equal to, greater than, greater than or equal to ... etc.alter
select title, rental_rate, rating, replacement_cost
from film
where replacement_cost >= 20;


# BETWEEN

-- condition where you need to find a value between two numbers
select title, replacement_cost
from film
where replacement_cost between 10 and 20;


# IN
-- tests if the value is in the list
select title, rating
from film
where rating in ('G', 'PG', 'PG-13');

# LIKE
-- looks for a string pattern that matches it
-- % denotes zero or more characters
-- _ denotes one character
select title
from film
where title like 'f_l%e%';

# IS NULL

select * from film where original_language_id is null;
select * from film where original_language_id is not null;