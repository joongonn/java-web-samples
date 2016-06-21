## java-web-samples
Quick hello-world survey of a few Java micro web frameworks including:
- ratpack
- spring-boot
- vertx

To get a single REST endpoint up and running at `http://localhost:8080/user/{id}`.

#### Prerequisites
Install JDK 1.8 + Gradle.

#### To generate Eclipse project files
Execute the gradle `eclipse` task eg.
```
java-web-samples/vertx-sample$ gradle eclipse
```

#### To run sample(s)
Execute the gradle `run` task eg.
```
java-web-samples/vertx-sample$ gradle run
```

#### To package executable fatjar(s)
Execute the gradle `shadowJar` task eg.
```
java-web-samples/vertx-sample$ gradle shadowJar
```

* For `springboot-sample`, execute the gradle `build` task eg.
```
java-web-samples/springboot-sample$ gradle build
```
