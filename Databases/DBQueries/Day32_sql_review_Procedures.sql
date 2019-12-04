-- Stored Procedures:
-- subroutine/subprogram stored in database
-- like functions, can take in parameters and run numerous sql statements
-- unlike functions, do not return value directly


select database();

use sakila;



# STORED PROCEDURES AND DELIMITERS

/*
	delimiter: character or string of characters used to end an SQL statement,
			   the ; is used as a common delimiter in MySQL
               
	problem:  in stored procedures, we need a delimiter to end the procedure, but
			  the ; is already used mulitple times, so we need to use a different
              delimiter
*/

-- create our procedure
delimiter $$

create procedure spExample()
begin
	select * from actor;
    select * from film;
    select * from film_actor;
end $$

delimiter ;

-- call our procedure
call spExample();



# VARIABLES

use sql_review;

create table employee
(
	empl_id int primary key auto_increment,
    empl_name varchar(30),
    hourly_rate double,
    email varchar(50)
);

insert into employee values(null, 'sam', 15, 'sam@mail.com');

select * from employee;


/*
	VARIABLE TYPES:
    
    in    = pass a value to procedure, value can be modified within but 
			modification not visible to caller
    
    out   = passes a value from the procedure back to the caller, starts as a null
			value and value is vissible to caller after procedure runs
    
    inout = can pass a value from the caller, be modified within the procedure and
			then visible to the caller after the procedure runs

*/


delimiter $$

create procedure spAddEmployee(in empName varchar(30),
		in hourly double, out salary double, inout emailInput varchar(50))
begin
	-- create local variables
    declare email varchar(50);
    
    -- calculate salary
    select hourly * 40 * 52 into salary;
    
    -- format our email
    select concat(empName, '@', emailInput)  into email;
    select email into emailInput;
    
    -- insert to the table
    insert into employee values(null, empName, hourly, emailInput);
    
end $$

delimiter ;


-- create local variables
set @nameInput = 'orquid';
set @hourly = 40;
set @salary = 0;
set @emailInput = 'gmail.com';

call spAddEmployee(@nameInput, @hourly, @salary, @emailInput);

select * from employee;

select @nameInput, @hourly, @salary, @emailInput;



create table employee 
(
	empl_id int primary key auto_increment,
    empl_name varchar(30),
    hourly_rate double,
    email varchar(50)
);

insert into employee values(null, 'sam', 10, 'sam@mail.com');
​
​
# PROCEDURES WITH IF STATMENTS
​
delimiter $$

create procedure passwordStrength(in pw varchar(100))
begin
	if (length(pw) > 10) then
		select 'password is very strong';
	else
		select 'password too weak';
	end if;
end $$
​
delimiter ;


call passwordStrength('12345678901');



# PROCEDURES WITH SWITCH CASE

create table animal 
(
	animal_id int not null primary key,
    animal_type varchar(30) not null unique
);

insert into animal values(1, 'dog');
insert into animal values(2, 'cat');
insert into animal values(3, 'rabbit');
insert into animal values(4, 'snake');
insert into animal values(5, 'fish');
insert into animal values(6, 'bird');
insert into animal values(7, 'unknown');

select * from animal;

create table pet 
(
	pet_id int not null primary key auto_increment,
    pet_name varchar(30) not null,
    animal_id int not null,
    foreign key (animal_id) references animal(animal_id)
);

insert into pet values(null, 'tiger', 2);

select * from pet;
​
​
​
​
delimiter $$

create procedure addPet(in petName varchar(30), in animalType varchar(30))
begin
	declare animalID int;
    
    case
		when (animalType = 'dog') then
			select 1 into animalID;
		when (animalType = 'cat') then
			select 2 into animalID;
		when (animalType = 'rabbit') then
			select 3 into animalID;
		when (animalType = 'snake') then
			select 4 into animalID;
		when (animalType = 'fish') then
			select 5 into animalID;
		when (animalType = 'bird') then
			select 6 into animalID;
		else
			select 7 into animalID;
    
    end case;
    
    insert into pet values(null, petName, animalID);
end $$
​
delimiter ;

select * from pet;

call addPet('worm', 'snake');

call addPet('who knows???', '????');
​
​
​
​
# PROCEDURES WITH WHILE LOOPS
​
delimiter $$

create procedure addIterations(inout num int)
begin
	set @sum = 0;
    
    while (num > 0)
    do
		set @sum = @sum + num;
        set num = num - 1;
    end while;
    
    select @sum into num;

end $$
​
delimiter ;


set @temp = 24;

call addIterations(@temp);

select @temp;
​
​
# ALTER PROCEDURES
-- you can only alter the characteristics of a procedure, not the actual body or
-- parameters
​
delimiter $$

create procedure temp()
comment 'hello'
begin
	select * from animal;
end $$
​
delimiter ;


call temp();

alter procedure temp
	comment 'bye';


# drop procedure temp;



