/** DDL FOR SECTION #6: REST CRUD API*/
use mydb;

create table product(
id int auto_increment PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);

select * from product;