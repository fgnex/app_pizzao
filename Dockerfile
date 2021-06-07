FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY /app/origininhos-backend-master /app/origininhos-backend-master

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/origininhos-backend-master"]

##