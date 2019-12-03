-- Transactional Control Language (TCL)
-- manage transactions in a database
-- transactions: changes made to data by DML statements
-- allows statements to be grouped togethere in logical transactions

use sql_review;

-- create table (DDL command)
create table pet
(
	pet_id int,
    pet_type varchar(100)
);

-- set session so no autocommits are completed
set session autocommit = 0;


# COMMIT

-- insert a record
insert into pet values(1, 'dog');

-- first commit
commit;

-- insert more records
insert into pet values(2, 'cat');
insert into pet values(3, 'rabbit');

-- what records are in our table
select * from pet;


# ROLLBACK

-- undo everything up until the last commit
rollback;
SELECT * FROM pet;


# AUTOCOMMIT WITH DDL

-- insert another value
insert into pet values(4, 'turtle');

-- truncate table
truncate table pet;

insert into pet values(5, 'fish');
insert into pet values(6, 'snake');

-- rollback to last commit: truncate
rollback;
SELECT * FROM pet;


# SAVEPOINT

#    1 |..... 2 ....... 3 .... 4 ....... 

-- insert
savepoint before_insert;
insert into pet values(1, 'dog');
insert into pet values(2, 'cat');

-- check our table
select * from pet;

-- delete
savepoint before_delete;
DELETE FROM pet 
WHERE pet_id = 1;

-- check our table
select * from pet;

-- update
savepoint before_update;
UPDATE pet 
SET pet_type = 'fish'
WHERE pet_id = 2;

-- check our table
select * from pet;


-- rollback to savepoints
rollback to before_update;
SELECT * FROM pet;

rollback to before_delete;
SELECT * FROM pet;

rollback to before_insert;
SELECT * FROM pet;

-- regular rollback
rollback;
SELECT * FROM pet;
