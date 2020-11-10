create database employee;

use employee;

create table employee(
     id int auto_increment,
     name varchar(30) not null,
     email varchar(30) not null,
     role_id int,
     department_id int,
     primary key (id));
	 
 create table department(
     id int auto_increment,
     department_name varchar(50) not null,
     department_description tinytext not null,
     primary key (id));
	 
 create table role(
     id int auto_increment,
     role varchar(30) not null,
     primary key(id));
	 
alter table employee
     add foreign key (role_id) references role (id);
	 
alter table employee
     add foreign key (department_id) references department(id);
	 
	 
	 
insert into role (role)
    values ('android developer');
	
insert into role (role)
     values ('c# developer');
	 
insert into role (role)
    values ('java developer');
	
	
	
insert into department (department_name,department_description)
     values ('java department','development of office applications');
	 
insert into department (department_name,department_description)
     values ('front end department','front end development');
	 
insert into department (department_name,department_description)
    ('android department','mobile development');
	
	
	
insert into employee  (name,email,role_id,department_id)
     values ('Tom','tom@gmail.com','3','1');
	 
insert into employee  (name,email,role_id,department_id)
    values ('Bill','bill@gmail.com','1','3');
	
insert into employee  (name,email,role_id,department_id)
     values ('Sara','sara@gmail.com','3','2');
	 
