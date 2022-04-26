package edu.school21.chat.app;

import com.zaxxer.hikari.HikariDataSource;
import edu.school21.chat.repositories.MessagesRepository;
import edu.school21.chat.repositories.MessagesRepositoryJdbcImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {

        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:postgresql://localhost:5432/chat");
        ds.setUsername("acollin");
        ds.setPassword("1");

        MessagesRepository msg = new MessagesRepositoryJdbcImpl(ds);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message ID");
        System.out.println("->");
        System.out.println(msg.findById(sc.nextLong()));

    }
}
