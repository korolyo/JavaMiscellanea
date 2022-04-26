package edu.school21.chat.repositories;

import edu.school21.chat.models.Message;
import edu.school21.chat.models.Chatroom;
import edu.school21.chat.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;

public class MessagesRepositoryJdbcImpl implements MessagesRepository{

    private final DataSource ds;

    public MessagesRepositoryJdbcImpl(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public Optional<Message> findById(Long message_id) throws SQLException{
        Optional<Message> optionalMessage;

        Connection connection = ds.getConnection();

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM chat.message WHERE message_id = " + message_id;
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        User user = new User(1, "Acollin", "hello", null, null);
        Chatroom chatroom = new Chatroom(1, "chatroom", null, null);
        optionalMessage = Optional.of(new Message(resultSet.getInt(1), user, chatroom, resultSet.getString("message"), LocalDateTime.of(2022, 4, 20, 16, 20)));

        return optionalMessage;
    }

}