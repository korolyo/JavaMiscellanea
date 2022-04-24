package edu.school21.chat.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {

    private int             messageId;
    private User            messageAuthor;
    private Chatroom        messageRoom;
    private String          messageText;
    private LocalDateTime   messageDate;

    public Message(int messageId, User messageAuthor, Chatroom messageRoom, String messageText, LocalDateTime messageDate) {
        this.messageId = messageId;
        this.messageAuthor = messageAuthor;
        this.messageRoom = messageRoom;
        this.messageText = messageText;
        this.messageDate = messageDate;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(User messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public Chatroom getMessageRoom() {
        return messageRoom;
    }

    public void setMessageRoom(Chatroom messageRoom) {
        this.messageRoom = messageRoom;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(LocalDateTime messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return getMessageId() == message.getMessageId() && Objects.equals(getMessageAuthor(), message.getMessageAuthor()) && Objects.equals(getMessageRoom(), message.getMessageRoom()) && Objects.equals(getMessageText(), message.getMessageText()) && Objects.equals(getMessageDate(), message.getMessageDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessageId(), getMessageAuthor(), getMessageRoom(), getMessageText(), getMessageDate());
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", messageAuthor=" + messageAuthor +
                ", messageRoom=" + messageRoom +
                ", messageText='" + messageText + '\'' +
                ", messageDate=" + messageDate +
                '}';
    }
}
