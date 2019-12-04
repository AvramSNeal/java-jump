-- Views
-- a virtual table
-- result of a base table
-- definition built on top of other tables or views

use sakila;


# CREATE A VIEW

-- simple view

create view view_example 
as select * from actor;

select * from view_example;


create view complex 
as select title from film
where film_id in (select film_id from film_actor
					where actor_id in (select actor_id from actor 
										where first_name = 'sissy'));
                                        
select * from complex;



# ALTER VIEW
alter view view_example
as select * from actor;

select first_name from view_example;


# DROP VIEW

# drop view view_example;
