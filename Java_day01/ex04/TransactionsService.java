package ex04;

import ex04.user.User;
import ex04.user.UsersList;

public class TransactionsService {
    UsersList users;

    public void addUser(User user) {

    }

    public int getUserBalance(User user) {
        return user.getBalance();
    }


}