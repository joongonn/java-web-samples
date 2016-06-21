## java-web-samples
What are the options available to quickly get a RESTful backend bootstrapped and running?

Quick hello-world survey of a few Java (micro) web frameworks including:
- [ratpack](https://ratpack.io/)
- [spring-boot](http://projects.spring.io/spring-boot/)
- [vertx](http://vertx.io/)

#### Goal
To get a single `GET` REST endpoint up and responding at `http://localhost:8080/user/{id}`.

#### Prerequisites
Install JDK 1.8 + [Gradle](http://gradle.org/).

#### To generate Eclipse project files
Execute the gradle `eclipse` task:
```
java-web-samples/vertx-sample$ gradle eclipse
```

#### To run sample(s)
Execute the gradle `run` task to start the server:
```
java-web-samples/vertx-sample$ gradle run
:compileJava
:processResources UP-TO-DATE
:classes
:run
Starting server on *:8080 ...
```
Hit the endpoint
```
java-web-samples/vertx-sample$ curl http://localhost:8080/user/12345
{
  "id" : "12345",
  "name" : "user"
}
```
#### To package executable fatjar(s)
Execute the gradle `shadowJar` task:
```
java-web-samples/vertx-sample$ gradle shadowJar
```
The distributable jar will be available in the `build/libs/` folder
```
java-web-samples/vertx-sample$ ls -1 build/libs/
vertx-sample-all.jar
```
For `springboot-sample`, execute the gradle `build` task (**instead of** `shadowJar`):
```
java-web-samples/springboot-sample$ gradle build
```
