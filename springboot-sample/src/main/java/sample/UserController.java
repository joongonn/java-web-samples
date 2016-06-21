package sample;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/{id}")
    public Callable<User> getById(@PathVariable long id) {
        return new Callable<User>() {
            @Override
            public User call() {
                return new User(id, "User");
            }
        };
    }
}
