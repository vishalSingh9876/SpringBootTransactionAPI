
How to Dockerize Spring Boot Application
Build Docker -f springboot-test-application.jar

$ docker build -t spring-boot-docker.jar .
Check Docker springboot-test-application.jar

$ docker image ls
Run Docker springboot-test-application.jar

$ docker run -p 9090:8080 springboot-test-application.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.

*****************************

Also attaching postman Json of basic testing.

