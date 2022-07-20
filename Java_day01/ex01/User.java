package ex01;

import ex01.User;
import ex01.UserIdsGenerator;

public class User {
    private final int   id;
    private String      name;
    private int         balance;

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        if (balance < 0)
            this.balance = 0;
        else
            this.balance = balance;
    }

    public User(String name, int balance) {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.name = name;
        if (balance < 0)
            this.balance = 0;
        else
            this.balance = balance;
    }
}