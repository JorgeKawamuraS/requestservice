FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} requestservice.jar

ENTRYPOINT ["java","-jar","requestservice.jar"]