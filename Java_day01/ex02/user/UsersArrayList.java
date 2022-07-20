package ex02.user;

import ex02.UserNotFoundException;
import ex02.user.UsersList;
import ex02.user.User;

public class UsersArrayList implements UsersList {

    private int arrayListLength = 10;
    private User[] arrayList = new User[10];
    private int num = 0;

    @Override
    public void addUser(User user) {


    }

    @Override
    public User getUserById(int id) throws UserNotFoundException {

    }

    @Override
    public User getUserByIndex(int index) throws UserNotFoundException {

    }

    @Override
    public int getNumberOfUsers() {
        return num;
    }
}