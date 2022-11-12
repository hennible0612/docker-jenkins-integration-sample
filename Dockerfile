FROM openjdk:8
EXPOSE 8080
VOLUME /tmp
ADD build/libs/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample.jar"]

