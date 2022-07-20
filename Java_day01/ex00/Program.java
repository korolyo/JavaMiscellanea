package ex00;

import ex00.User;
import ex00.Transaction;

public class Program {
    public static void main(String[] args) {
        User sender = new User(1, "Dmytry", 500);
        User recepient = new User(2, "Saveliy", 1000);

        Transaction fistTransaction = new Transaction(sender, recepient, 200, 1);
        Transaction secondTransaction = new Transaction(sender, recepient, -400, 2);
    }
}