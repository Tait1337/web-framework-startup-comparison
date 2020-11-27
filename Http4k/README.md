# Http4K sample Web-Application

## About
http4k is a lightweight but fully-featured HTTP toolkit written in pure Kotlin that enables the serving and consuming of HTTP services in a functional and consistent way. http4k applications are just Kotlin functions which can be mounted into a running backend.

Web Engine: Tomcat, but you can switch to: Jetty, CIO, Netty, Ratpack, Undertow, SunHttp
JSON Serializer: Jackson, but you can switch to: Argo, GSON, Kotlinx.Serialization, Moshi

Http4k might come up in Future with Coroutine Support: https://github.com/http4k/http4k/issues/94

## Build with Gradle
```
./gradlew build
./docker build -t http4k:0.0.1-SNAPSHOT .
```
## Run via JVM
```
./java -jar build/libs/http4k-0.0.1-SNAPSHOT-all.jar
```

## Run as Docker Container
```
./docker run -i --rm -p 8080:8080 http4k:0.0.1-SNAPSHOT
```

## Call REST-Endpoint
```
curl http://localhost:8080/greet/John
// returns: {"timestamp":"2020-11-27T12:10:53.6357915","name":"John","message":"Hello!"}
```