package ex01;

import ex01.User;
import ex01.UserIdsGenerator;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("John", 500);
        User user2 = new User("Jim", 1000);

        System.out.println(user1.getId());
        System.out.println(user2.getId());
    }
}