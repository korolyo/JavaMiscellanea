package edu.school21.chat.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        String connectionUrl = "localhost;"
                + "database=Chat;"
                + "user=acollin;"
                + "password=1;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
