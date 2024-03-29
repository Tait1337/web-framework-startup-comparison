#####
# The builder image to build the native app
#####
FROM findepi/graalvm:java17-native as builder
LABEL stage=builder

WORKDIR /builder
COPY ./build/libs/ktor-0.0.1-SNAPSHOT-all.jar ./app.jar
COPY graal-reflection-configuration.json ./graal-reflection-configuration.json
RUN native-image \
    --no-fallback \
    --static \
    -H:IncludeResources="(.*.properties)|(static/.*)|(META-INF/.*)" \
    -H:ReflectionConfigurationFiles=graal-reflection-configuration.json \
    --allow-incomplete-classpath \
    --initialize-at-build-time=io.ktor,kotlinx,kotlin \
    -jar app.jar

#####
# The actual image to run
#####
FROM alpine:3.16
LABEL maintainer="tait1337"
RUN apk --no-cache add ca-certificates

# App
WORKDIR /app
RUN chown 1001 /app \
    && chmod "g+rwX" /app \
    && chown 1001:root /app
COPY --chown=1001:root --from=builder /builder/app .

EXPOSE 8080
USER 1001

ENTRYPOINT ["./app"]