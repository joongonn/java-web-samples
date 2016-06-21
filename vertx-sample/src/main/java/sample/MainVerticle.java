package sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {

    private final int port;
    
    public MainVerticle(int port) {
        this.port = port;
    }

    @Override
    public void start() throws Exception {
        UserVerticle userVerticle = new UserVerticle();
        vertx.deployVerticle(userVerticle);
        
        Router mainRouter = Router.router(vertx);
        mainRouter.get("/user/:id").handler(userVerticle::getUserById);
        
        vertx.createHttpServer()
            .requestHandler(mainRouter::accept)
            .listen(port);
    }
}
