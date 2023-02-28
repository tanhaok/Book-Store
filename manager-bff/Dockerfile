FROM openjdk:17-jdk-alpine
RUN apk add --no-cache bash
COPY target/backoffice-bff-0.0.1-SNAPSHOT.jar backoffice-bff-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backoffice-bff-0.0.1-SNAPSHOT.jar"]