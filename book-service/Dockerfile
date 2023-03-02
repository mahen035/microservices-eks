FROM eclipse-temurin:17
LABEL mantainer="mahen518@gmail.com"
EXPOSE 8081
WORKDIR /app
COPY target/book-service-0.0.1-SNAPSHOT.jar /app/book-service.jar
ENTRYPOINT ["java", "-jar", "book-service.jar"]