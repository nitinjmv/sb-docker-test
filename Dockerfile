FROM openjdk:11
COPY target/docker-test.jar docker-test.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "docker-test.jar"]