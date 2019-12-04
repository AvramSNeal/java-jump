-- Numeric Functions:
-- used for numeric manipulation or calculation

# CEIL
-- rounds a number up to the next whole number
select ceil(2.000001);


# FLOOR	
-- rounds a number down to the next whole number
select floor(9.9999999);


# POW
-- gets the power of a number
select pow(3, 5);


# GREATEST
-- gets the biggest value out of a list
select greatest(3, 5, 7, 3, 5);


-- error: cannot pass column as parameter
-- select greatest(rental_rate) from film;


