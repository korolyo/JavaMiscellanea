package ex02;

import ex02.user.User;
import ex02.user.UsersList;

public class Program {

    public static void main(String[] args) {
        UsersList usrs = new UsersArrayList();
        User us1 = new User("John", 500);
        User us2 = new User("Zea", 500);
        User us3 = new User("Leon", 500);
        User us4 = new User("Pudge", 500);
        User us5 = new User("Lokki", 500);
        User us6 = new User("Karim", 500);
        User us7 = new User("Neo", 500);
        User us8 = new User("Flex", 500);
        User us9 = new User("Lock", 500);
        User us10 = new User("Nitzhe", 500);
        User us11 = new User("Tolstoy", 500);
        User us12 = new User("Tony", 500);

        usrs.addUser(us1);
        usrs.addUser(us2);
        usrs.addUser(us3);
        usrs.addUser(us4);
        usrs.addUser(us5);
        usrs.addUser(us6);
        usrs.addUser(us7);
        usrs.addUser(us8);
        usrs.addUser(us9);
        usrs.addUser(us10);
        usrs.addUser(us11);
        usrs.addUser(us12);

    }
}