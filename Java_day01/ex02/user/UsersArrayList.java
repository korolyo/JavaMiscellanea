package ex02.user;

import java.util.ArrayList;
import java.util.UUID;

public class UsersArrayList implements UsersList {
    ArrayList<User> usersList = new ArrayList<User>();

    @Override
    public void addUser(User user) {

    }

    @Override
    public User retrieveUserById(UUID id) {
        return null;
    }

    @Override
    public User retrieveUserByIndex(int index) {
        return null;
    }

    @Override
    public int retrieveNumberOfUsers() {
        return 0;
    }
}