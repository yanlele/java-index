## 对于mybatis的研究


- [Mybatis教程-实战看这一篇就够了](https://blog.csdn.net/hellozpc/article/details/80878563)

```mysql
create database if not exists mybatisdemo;

create table if not exists tb_user
(
  id        int auto_increment,
  user_name varchar(32) default null,
  password  varchar(32) default null,
  name      varchar(32) default null,
  age       int(10)     default null,
  sex       int(2)      default null,
  birthday  datetime    default null,
  created   datetime    default null,
  updated   datetime    default null,
  primary key (id)
) engine = innoDB
  default charset = utf8;

use mybatisdemo;

INSERT INTO tb_user (user_name, password, name, age, sex, birthday, created, updated)
VALUES ('zpc', 123456, '鹏程', 22, 1, '1990-09-02', sysdate(), sysdate());

INSERT INTO tb_user (user_name, password, name, age, sex, birthday, created, updated)
VALUES ('hj', '123456', '静静', '22', '1', '1993-09-05', sysdate(), sysdate());

select * from tb_user;
```
