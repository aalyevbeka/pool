create table users (
user_id int AUTO_INCREMENT,
email varchar(255),
last_name varchar(255),
role varchar (255),
name varchar(255),
password varchar(255),
primary key (user_id));


create table role (
role_id int  AUTO_INCREMENT,
roles varchar(255),
primary key (role_id));

create table user_role (
role_id int ,
user_id integer ,
primary key (user_id));


alter table user_role add constraint FKa68196081fvovjhkek5m97n3y
foreign key (role_id) references role (role_id);

alter table user_role add constraint FKj345gk1bovqvfame88rcx7yyx
foreign key (user_id) references users (user_id);