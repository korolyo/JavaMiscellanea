package edu.school21.chat.repositories;

public class MessagesRepository {

    Optional<Message> findById(long message_id) throws SQLException;
}