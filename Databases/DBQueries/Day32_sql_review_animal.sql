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