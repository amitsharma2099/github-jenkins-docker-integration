FROM openjdk:8-alpine
EXPOSE 8081
ADD target/github-jenkins-docker-integration.jar github-jenkins-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/github-jenkins-docker-integration.jar"]