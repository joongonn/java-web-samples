package sample;

import io.vertx.core.Vertx;

/*
 * https://github.com/eclipse/vert.x
 * http://vertx.io/docs/vertx-core/java/
 */
public class Main {

    public static void main(String[] args) {
        final int port = 8080;
        MainVerticle mainVerticle = new MainVerticle(port);

        System.out.println("Starting server on *:8080 ...");
        
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(mainVerticle);
    }
}
