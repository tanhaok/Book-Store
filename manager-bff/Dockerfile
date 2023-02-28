FROM openjdk:17-jdk-alpine
RUN apk add --no-cache bash
COPY target/manager-bff-0.0.1-SNAPSHOT.jar manager-bff-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/manager-bff-0.0.1-SNAPSHOT.jar"]