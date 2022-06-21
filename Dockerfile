FROM openjdk:11
EXPOSE 8080
ADD target/springboot-test-application.jar springboot-test-application.jar
ENTRYPOINT ["java","-jar","/springboot-test-application.jar"]