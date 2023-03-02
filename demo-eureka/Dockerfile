FROM eclipse-temurin:17

LABEL mantainer="mahen518@gmail.com"

WORKDIR /app

COPY target/demo-eureka-0.0.1-SNAPSHOT.jar /app/demo-eureka.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "demo-eureka.jar"]