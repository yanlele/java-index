# Shiro专题

表从简：                    
```mysql
create database if not exists shiro character set utf8;

use shiro;

create table if not exists user
(
    id       bigint      not null auto_increment primary key comment '主键ID',
    username varchar(50) not null comment '用户名',
    password varchar(50) not null comment '密码',
    role     varchar(50) not null comment '角色'
) character set utf8;

create table if not exists role
(
    id   bigint      not null auto_increment primary key comment '主键ID',
    role varchar(50) not null comment '角色'
) character set utf8;

insert into user (username, password, role)
values ('admin', '123456', 'user'),
       ('admin2', '123456', 'admin');

insert into role (role)
values ('admin'),
       ('user');
```

