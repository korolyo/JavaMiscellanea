package edu.school21.chat.repositories;

import edu.school21.chat.repositories.MessageRepository;
import java.sql.*;
import javax.sql.*;

public class MessagesRepositoryJdbcImpl implements MessagesRepository{

    private final DataSource ds;

    public MessagesRepositoryJdbcImpl(DataSource ds) {
        this.ds = ds;
    }

    @Override
    Optional<Message> findById(long message_id) throws SQLException{
        Optional<Message> optionalMessage;

        return optionalMessage;
    }

}