# Dockerfile for the backend in the production environment
FROM amazoncorretto:19.0.1-alpine

WORKDIR /app

# Copy the jar file to the container
COPY target/*.jar app.jar

# Run the jar with the production application properties
ENTRYPOINT ["java","-Dspring.profiles.active=${SPRING_PROFILE_ACTIVE}","-jar","app.jar"]