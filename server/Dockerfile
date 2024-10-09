# Dockerfile for the Spring Boot server

# Use the openjdk 17 slim image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file from the build/libs folder
COPY build/libs/Global-Hope-Consortium-1.0.0-SNAPSHOT.jar /app/app.jar

# Expose the application port
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]