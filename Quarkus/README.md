# Quarkus sample Web-Application

## About
A Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM, crafted from the best of breed Java libraries and standards.

Web Engine: Vert.X, but you can switch to: Undertow, Netty
JSON Serializer: JSON-B, but you can switch to: Jackson

## Build with Gradle
```
./gradlew build "-Dquarkus.package.type=native" "-Dquarkus.native.container-build=true" "-Dquarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-native-image:22.1.0-java17"
docker build -f src/main/docker/Dockerfile.native-micro -t quarkus:0.0.1-SNAPSHOT .
```
## Run via JVM
```
java -jar build/quarkus-0.0.1-SNAPSHOT-native-image-source-jar/quarkus-0.0.1-SNAPSHOT-runner.jar
```

## Run as Docker Container
```
docker run -i --rm -p 8080:8080 quarkus:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"message":"Hello!","name":"John","timestamp":"2022-05-26T14:33:06.929531"}
```