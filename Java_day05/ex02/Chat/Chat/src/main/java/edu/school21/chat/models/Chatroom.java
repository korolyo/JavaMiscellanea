package edu.school21.chat.models;

import java.util.List;
import java.util.Objects;

public class Chatroom {
    private int             roomId;
    private String          roomName;
    private User            roomOwner;
    private List<Message>   messages;

    public Chatroom(int roomId, String roomName, User roomOwner, List<Message> messages) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomOwner = roomOwner;
        this.messages = messages;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public User getRoomOwner() {
        return roomOwner;
    }

    public void setRoomOwner(User roomOwner) {
        this.roomOwner = roomOwner;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chatroom chatroom = (Chatroom) o;
        return getRoomId() == chatroom.getRoomId() && Objects.equals(getRoomName(), chatroom.getRoomName()) && Objects.equals(getRoomOwner(), chatroom.getRoomOwner()) && Objects.equals(getMessages(), chatroom.getMessages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomId(), getRoomName(), getRoomOwner(), getMessages());
    }

    @Override
    public String toString() {
        return "Chatroom{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomOwner=" + roomOwner +
                ", messages=" + messages +
                '}';
    }
}
