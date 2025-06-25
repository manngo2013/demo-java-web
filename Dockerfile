# Determine the base image 
# Start with amazoncorretto JDK 21
FROM amazoncorretto:21.0.7

# Set the working directory
WORKDIR /app

# Copy the source code or binary files
COPY target/*.jar app.jar

# Define the networking and exposing ports
EXPOSE 8080
 
# Define the startup command
ENTRYPOINT ["java", "-jar", "app.jar"]