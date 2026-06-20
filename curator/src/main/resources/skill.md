# Project Configuration Summary

## 1. Project Setup
- **Maven Parent**: Spring Boot 2.7.6 (`spring-boot-starter-parent`)
- **Packaging**: Jar
- **Group/Artifact**: `org.example:curator:1.0-SNAPSHOT`


## 2. Key Dependencies
- **Spring Boot Core**: `spring-boot-starter`
- **Redis**: `spring-boot-starter-data-redis`
- **MySQL Connector**: `mysql-connector-java` (runtime scope)
- **MyBatis-Plus**: `mybatis-plus-boot-starter:3.5.3.1`
- **Testing**: JUnit 3.8.1 (test scope)
- **ZooKeeper Curator**: `curator-recipes:2.12.0`


## 3. Application Configuration (application.yml)
### Server
- Port: 8080 (default Spring Boot port)

### Spring Datasource (MySQL)
- URL: `jdbc:mysql://localhost:3306/curator?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai`
- Credentials: Placeholder variables `${your_mysql_username}` and `${your_mysql_password}`
- Driver: `com.mysql.cj.jdbc.Driver` (MySQL 8+ compatible)

### Redis
- Host: `localhost`
- Port: 6379
- Password: Empty (no password)
- Timeout: 2000ms
- Connection Pool: 
  - Max active: 8
  - Max idle: 8
  - Min idle: 2

### MyBatis-Plus
- Mapper XML location: `classpath*:mapper/**/*.xml`
- Entity package: `org.example.entity` (for type aliases)
- Configuration: Camel case mapping enabled (`map-underscore-to-camel-case: true`)


## 4. Main Application
- **Simple Entry Class**: `org.example.App` with basic "Hello World" output
- **Spring Boot Entry Class** (from demo project reference): `com.example.DemoApplication` annotated with `@SpringBootApplication`, using `SpringApplication.run()`
