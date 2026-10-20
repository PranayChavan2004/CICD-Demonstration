FROM eclipse-temurin:21-jre

WORKDIR /CICD_Demonstration

COPY target/*.jar example_app.jar

EXPOSE 8080

#dockerfile needs entrypoint to start the springboot project inside container and example_app.jar is what we needed to run our springboot project
ENTRYPOINT ["java", "-jar", "example_app.jar"]