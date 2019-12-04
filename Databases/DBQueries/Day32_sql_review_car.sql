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