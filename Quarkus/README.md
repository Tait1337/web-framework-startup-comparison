# Quarkus sample Web-Application

## About
A Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM, crafted from the best of breed Java libraries and standards.

Web Engine: Vert.X, but you can switch to: Undertow, Netty
JSON Serializer: JSON-B, but you can switch to: Jackson

Quarkus needs to catch up with Support for GraalVM 20.3 and Kotlin 1.4.

## Build with Gradle
```
./gradlew buildNative -Dquarkus.native.container-build=true
./docker build -f src/main/docker/Dockerfile.native -t quarkus:0.0.1-SNAPSHOT .
```
## Run via JVM
```
./java -jar build/quarkus-0.0.1-SNAPSHOT-native-image-source-jar/quarkus-0.0.1-SNAPSHOT-runner.jar
```

## Run as Docker Container
```
./docker run -i --rm -p 8080:8080 quarkus:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"timestamp":"2020-11-27T12:10:53.6357915","name":"John","message":"Hello!"}
```