# Spring Study Memo

After trying tons of ways of learning Spring, I finally realize the best way to study a framework is its 
official website, including guides and reference documents.

This project contain all the useful examples from official documents for learning Spring framework.

All examples are organized by categories.

[Spring Guide & Tutorial](https://spring.io/guides)

## Modules

Each module contain a self-contain and able to run Spring application.

### RESTful Application

[Spring REST Reference Docs](https://docs.spring.io/spring-restdocs/docs/2.0.5.RELEASE/reference/html5/)

- 01 Simple RESTful Web Service: A simple RESTful application with @RestController
- 02 Consume RESTful Service: Use RestTemplate to access RESTful API
- 03 RESTful Service with Actuator: use actuator to manage your application and run some unit test
- 04 Hypermedia RESTful Service: HATEOAS

### Data Persistence

[Spring Data Reference Docs](https://spring.io/projects/spring-data#overview)

Spring Data Program contains different modules for data access.

- 05 JPA Data with REST: Use JPA to access runtime H2 database by auto-generate RESTful annotation
- 06 Access Data with JPA: Access runtime H2 database with JPA
- 07 Access Data with JDBC: Access runtime H2 database with JDBC

### Security

[Spring Security Topical Guide](https://spring.io/guides/topicals/spring-security-architecture/)

- [08 Basic Security in Spring](https://spring.io/guides/gs/securing-web/): authentication (who are you?) and authorization/access control (what are you allowed to do?)
- [09 Spring Boot with OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/): sample app with "social login"
- 10 Spring Security with MySQL: store username and password in MySQL database with encryption

Note: in module 09 you need to create a new `application.yaml` with following form:

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            clientId: github-client-id
            clientSecret: github-client-secret
          google:
            client-id: google-client-id
            client-secret: google-client-secret
```

### Deployment

[Docker Reference Doc](https://docs.docker.com/reference/)

- 11 [Spring Boot Docker](https://spring.io/guides/topicals/spring-boot-docker/): Basic tutorial for using docker in Spring Boot Application