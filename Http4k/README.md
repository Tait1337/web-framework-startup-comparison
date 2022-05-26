# Http4K sample Web-Application

## About
http4k is a lightweight but fully-featured HTTP toolkit written in pure Kotlin that enables the serving and consuming of HTTP services in a functional and consistent way. http4k applications are just Kotlin functions which can be mounted into a running backend.

Web Engine: Tomcat, but you can switch to: Jetty, CIO, Netty, Ratpack, Undertow, SunHttp
JSON Serializer: Jackson, but you can switch to: Argo, GSON, Kotlinx.Serialization, Moshi

## Build with Gradle
```
./gradlew build
docker build -t http4k:0.0.1-SNAPSHOT .
```
## Run via JVM
```
java -jar build/libs/http4k-0.0.1-SNAPSHOT-all.jar
```

## Run as Docker Container
```
docker run -i --rm -p 8080:8080 http4k:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"timestamp":"2022-05-26T14:13:30.878312","name":"John","message":"Hello!"}
```