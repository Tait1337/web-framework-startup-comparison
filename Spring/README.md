# Spring sample Web-Application

## About
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.

Web Engine: Netty, but you can switch to: Tomcat, Jetty, Undertow
JSON Serializer: Jackson, but you can switch to: GSON, Kotlinx.Serialization

## Build with Gradle
```
./gradlew bootBuildImage
```
## Run via JVM
```
./java -jar build/libs/spring-0.0.1-SNAPSHOT.jar
```

## Run as Docker Container
```
./docker run -i --rm -p 8080:8080 spring:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"timestamp":"2020-11-27T12:10:53.6357915","name":"John","message":"Hello!"}
```