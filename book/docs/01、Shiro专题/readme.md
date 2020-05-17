# Shiro专题


## 角色权限管理

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

依赖：                     
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.0.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.yanle</groupId>
    <artifactId>shior</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>shior</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
        </dependency>

        <dependency>
            <groupId>org.apache.shiro</groupId>
            <artifactId>shiro-spring</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```


## 接入jwt
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

alter table user add column permission varchar(50) comment '权限';
alter table user add column ban int(2) comment '是否账号被锁定';


create table if not exists role
(
    id   bigint      not null auto_increment primary key comment '主键ID',
    role varchar(50) not null comment '角色'
) character set utf8;

alter table role add column permission varchar(50) comment '权限';

insert into user (username, password, role)
values ('admin', '123456', 'user'),
       ('admin2', '123456', 'admin');

insert into role (role)
values ('admin'),
       ('user');
```