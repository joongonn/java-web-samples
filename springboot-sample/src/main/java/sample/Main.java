package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // -Dserver.port=8080 -Dserver.undertow.io-threads=8 -Dserver.undertow.worker-threads=16 
        SpringApplication.run(Main.class, args);
    }
}
