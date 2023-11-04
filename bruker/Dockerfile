# Use the official maven/Java 17 image to create a build artifact.
FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /usr/src/app
COPY . .
RUN mvn clean package -DskipTests

# Use the official OpenJDK 17 image to run the application.
FROM openjdk:17-slim
COPY --from=build /usr/src/app/target/bruker-0.0.1-SNAPSHOT.jar /usr/app/bruker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/bruker.jar"]
