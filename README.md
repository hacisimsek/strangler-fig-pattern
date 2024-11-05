# Strangler Fig Pattern
This repository showcases the Strangler Fig Pattern for transitioning legacy code to modern code incrementally, allowing for new features alongside existing ones. Includes examples, refactoring steps, and guidelines for a smooth migration.

## Requirements

For building and running the application you need:

- [JDK 17.0.13](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3.3.2](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.hacisimsek.StranglerMonolithApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
