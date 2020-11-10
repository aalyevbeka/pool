insert into users(user_id,name ,last_name,email,password)
values (1,'aidar','bektashev','aidar@gmail.com','123'),
(2,'deniz','bektashev','deniz@mail.ru','111'),
(3,'artur','kochkorov','artur@mail.ru','222');


insert into role (role_id,roles)
values (1,'admin'),(2,'user');

insert into user_role(role_id, user_id)
values (1,2)