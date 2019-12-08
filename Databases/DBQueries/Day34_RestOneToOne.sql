create database if not exists rest_db;

use rest_db;

select * from student;

describe student;

insert into student values(1, 'temp@mail.com', 'test', 'data');

describe person;
describe address;

insert into person values(1, current_date(), 'orquidia', 'moreno', 1);
insert into address values(1, 'Dallas', 'TX', '1 North Street', '12345');

select * from person;
select * from address;