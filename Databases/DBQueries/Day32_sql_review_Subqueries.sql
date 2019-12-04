-- Subqueries:
-- a query within another query
-- the subquery is used to return data and outer query further restrics the data

use sakila;

-- -- FIRST EXAMPLE -- --

-- select * from film;
select * from film_actor;
select * from actor;

select * from film_actor where film_id = 1;

select actor_id from film_actor where film_id = 1;

select first_name, last_name from actor
where actor_id in (select actor_id from film_actor 
					where film_id = 1);
                    

-- -- SECOND EXAMPLE -- --

-- Problem: Find all film titles of an actor whose first name is 'Sissy'
select * from actor;
select * from actor where first_name = 'sissy';

select * from film;
select * from film_actor;

select actor_id from actor where first_name = 'sissy';


select * from film_actor
where actor_id in (select actor_id from actor 
					where first_name = 'sissy');


select title from film
where film_id in (select film_id from film_actor
					where actor_id in (select actor_id from actor 
										where first_name = 'sissy'));