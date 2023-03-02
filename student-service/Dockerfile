FROM eclipse-temurin:17

LABEL mantainer="mahen518@gmail.com"

WORKDIR /app

COPY target/student-service-0.0.1-SNAPSHOT.jar /app/student-service.jar

ENTRYPOINT ["java", "-jar", "student-service.jar"]