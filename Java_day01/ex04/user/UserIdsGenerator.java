package ex04.user;

public final class UserIdsGenerator {

    private static UserIdsGenerator INSTANCE;
    private static int id = 0;

    public static UserIdsGenerator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserIdsGenerator();
        }

        return INSTANCE;
    }

    public int generateId() {
        return id++;
    }

    public int getId() {
        return id;
    }
}