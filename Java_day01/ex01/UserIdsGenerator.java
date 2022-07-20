package ex01;

public final class UserIdsGenerator {

    private static UserIdsGenerator INSTANCE;
    private public int id = 1;

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