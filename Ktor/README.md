# Ktor sample Web-Application

## About
Ktor is an asynchronous framework for creating microservices, web applications, and more. It’s fun, free, and open source.

Web Engine: CIO, but you can switch to: Netty, Jetty, Tomcat, CIO, TestEngine
JSON Serializer: Kotlinx.Serialization, but you can switch to: GSON, Jackson

Ktor might come up in Future with Kotlin/native as alternative to GraalVM: https://youtrack.jetbrains.com/issue/KTOR-746

## Build with Gradle
```
./gradlew build
docker build -t ktor:0.0.1-SNAPSHOT .
```
## Run via JVM
```
java -jar build/libs/ktor-0.0.1-SNAPSHOT-all.jar
```

## Run as Docker Container
```
docker run -i --rm -p 8080:8080 ktor:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"timestamp":"2022-05-26T14:22:48.139680","name":"John","message":"Hello!"}
```