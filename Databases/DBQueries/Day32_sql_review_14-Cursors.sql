-- Cursors
-- controlled structures that allow you to traverse over records in a database

-- Important Properties
-- 1. Asensitive: server may make copy of its result table
-- 2. Read Only: Not updatable
-- 3. Nonscrollabe: you can only go in one direction, can't back or skip
--                  records

use sql_review;

create table car
(
	car_id int primary key auto_increment,
    car_color varchar(15),
    car_price double not null
);

insert into car(car_id, car_color, car_price) values(null, 'red', 40000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 30000);
insert into car(car_id, car_color, car_price) values(null, 'grey', 40000);
insert into car(car_id, car_color, car_price) values(null, 'white', 35000);
insert into car(car_id, car_color, car_price) values(null, 'red', 20000);
insert into car(car_id, car_color, car_price) values(null, 'red', 27000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 100000);
insert into car(car_id, car_color, car_price) values(null, 'blue', 55000);
insert into car(car_id, car_color, car_price) values(null, 'red', 40000);
insert into car(car_id, car_color, car_price) values(null, 'black', 150000);
insert into car(car_id, car_color, car_price) values(null, 'grey', 20000);

select * from car;
​
​
delimiter $$

create procedure lotValue(out total double)
begin
	-- declare variables
    declare finished integer default 0;
    declare carValue double default 0;
    
    -- declare cursor
    declare currentCar
		cursor for
        select car_price from car;
        
	-- declare not found handler
    declare continue handler for 
		not found set finished = 1;
        
	set @sum = 0;
    
    open currentCar;
    
    getPrice: loop
		-- get values/columns for row/record
        fetch currentCar into carValue;
        
        -- check if we need to break from loop
        if (finished = 1) then
			leave getPrice;
        end if;
        
        -- add value to our sum
        set @sum = @sum + carValue;
        
    end loop getPrice;
    
    close currentCar;
    
    select @sum into total;
	
end $$
​
delimiter ;


call lotValue(@carTotalValue);

select @carTotalValue;





