create table books (
id bigint not null,
author varchar(255),
book_name varchar(255),
descriptions varchar(255),
primary key (id));


create table roles (
roleid integer not null,
role_name varchar(255),
primary key (roleid)) ;


create table users (
userid integer not null,
active bit not null,
email varchar(255),
name varchar(255),
password varchar(255),
roleid integer,
primary key (userid)) ;


alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);
alter table users add constraint FKgrhs0suhl8cbodxn47xadxp94 foreign key (roleid) references roles (roleid);

REPLACE INTO `roles` VALUES (1,'USER');
REPLACE INTO `roles` VALUES (2,'ADMIN');