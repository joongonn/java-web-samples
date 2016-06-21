package sample;

import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

public class Main {

    public static void main(String[] args) throws Exception {
        UserHandler user = new UserHandler();
        
        RatpackServer.start(serverSpec -> serverSpec
            .serverConfig(ServerConfig.builder()
                .port(8080)
                .build())
            .handlers(chain -> chain
                .get("user/:id", user::getById)
        ));
   }
}