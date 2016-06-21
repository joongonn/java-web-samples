package sample;

public class User {

    private final long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getName() {
        return name;
    }
}