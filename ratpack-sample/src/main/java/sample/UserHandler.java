package sample;

import ratpack.handling.Context;
import static ratpack.jackson.Jackson.json;

public class UserHandler {

    public UserHandler() { }
    
    public void getById(Context ctx) {
        long userId = ctx.getPathTokens().asLong("id");
        ctx.render(json(new User(userId, "User")));
    }
}
