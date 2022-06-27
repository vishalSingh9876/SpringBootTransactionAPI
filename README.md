# SpringBootTransactionAPI


How to Dockerize Spring Boot Application

$ docker build -t springboot-test-application.jar .

Check Docker springboot-test-application.jar

$ docker image ls

Run Docker springboot-test-application.jar

$ docker run -p 9090:8080 springboot-test-application.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 9090 on the Host OS.

*****************************

Also attaching postman Json of basic testing.


*****************************

Also attached postman Json collection of basic testing that i have done for the API's.
More Negative test cases could have been added.

************************************
What more can be done:

I can add validation frame work for client side parameter validation like @Email,@NotNull etc for sender and reciever. Also added controller advice for exception handling that can extended to give client the proper messages if validation fails.

Also we can add JWT kind of authorization mechanism as well as swagger for API's.
