## springboot集成mybatis

安装依赖
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>1.3.2</version>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>

<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper</artifactId>
    <version>5.1.2</version>
</dependency>
```

配置：
```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: root
    password: 123456
    url: jdbc:mysql://your ip/base_platform?characterEncoding=utf-8&useSSL=false
  jackson:
    default-property-inclusion: non_null

mybatis:
  mapper-locations: classpath:mapper/*.xml
```

xmlMapper: classpath:mapper/*.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!--这个地方写mapper定义-->
<mapper namespace="com.yanle.baseplatform.mapper.EventMapper">

    <!--这个地方写实体类-->
    <resultMap id="BaseResultMap" type="com.yanle.baseplatform.entity.Event">
        <id column="id" property="id" jdbcType="INTEGER"/>
        <id column="platform" property="platform" jdbcType="VARCHAR"/>
        <id column="event_key" property="eventKey" jdbcType="INTEGER"/>
        <id column="description" property="description" jdbcType="INTEGER"/>
        <id column="update_time" property="updateTime" jdbcType="DATE"/>
        <id column="create_time" property="createTime" jdbcType="DATE"/>
    </resultMap>
    
    <!--查询方法-->
    <select id="findAll" resultMap="BaseResultMap">
        select id, platform, event_key, description
        from event;
    </select>
</mapper>
```

mapperInterface
```java
@Component(value = "eventMapper")
public interface EventMapper {

    List<Event> findAll();
}
```

实体类Event
```java
@Data
public class Event {
    private Integer id;

    private String platform;

    private String eventKey;

    private String description;

    private Date updateTime;

    private Date createTime;
}
```




