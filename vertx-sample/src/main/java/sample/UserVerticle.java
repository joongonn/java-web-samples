package sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class UserVerticle extends AbstractVerticle {
    
    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        
        router.get("/:id").handler(this::getUserById);
    }

    void getUserById(RoutingContext context) {
        vertx.executeBlocking((Future<User> future) -> {
            long userId = Long.parseLong(context.request().getParam("id"));
            future.complete(new User(userId, "user"));
        }, userResult -> {
            if (userResult.succeeded()) {
                User user = userResult.result();
                context.response()
                    .putHeader("content-type", "application/json; charset=utf-8")
                    .end(Json.encodePrettily(user));
            } else {
                context.response()
                    .setStatusCode(500)
                    .end();
            }
        });
    }
    
}
