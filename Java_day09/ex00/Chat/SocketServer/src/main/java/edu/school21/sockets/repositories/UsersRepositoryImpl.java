package edu.school21.sockets.repositories;

import com.zaxxer.hikari.HikariDataSource;
import edu.school21.sockets.models.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepositoryImpl implements UsersRepository {

    DataSource dataSource;

    public UsersRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement())
        {
            String sqlQuiry = "SELECT * FROM acollin.users WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(sqlQuiry);
            resultSet.next();

            user = new User(resultSet.getLong(1), resultSet.getString(2));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement())
        {
            String sqlQuiry = "SELECT * FROM acollin.users";
            ResultSet resultSet = statement.executeQuery(sqlQuiry);

            while(resultSet.next())
                userList.add(new User(resultSet.getLong(1), resultSet.getString(2)));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void save(User entity) {
        try (  Connection connection = dataSource.getConnection();
               PreparedStatement preparedStatement = connection.prepareStatement("insert into acollin.users VALUES (?, ?);");) {

            preparedStatement.setLong(1, entity.getId());
            preparedStatement.setString(2, entity.getEmail());
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(User entity) {
        String prepStatement = "UPDATE acollin.users " +
                "SET email = ? " +
                "WHERE id = ?;";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(prepStatement)){

            preparedStatement.setString(1, entity.getEmail());
            preparedStatement.setLong(2, entity.getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM acollin.users " +
                             "WHERE id = ?;"
             )){
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<User> findByEmail(String email) {
        User user = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM acollin.users " +
                             "WHERE email = ?;"
             )){

            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            user = new User(resultSet.getLong(1), resultSet.getString(2));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.of(user);
    }
}
