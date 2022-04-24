package edu.school21.chat.models;

import java.util.List;
import java.util.Objects;

public class User {
    private int             userId;
    private String          login;
    private String          password;
    private List<Chatroom>  createdRooms;
    private List<Chatroom>  userRooms;

    public User(int userId, String login, String password, List<Chatroom> createdRooms, List<Chatroom> userRooms) {
        this.userId = userId;
        this.login = login;
        this.password = password;
        this.createdRooms = createdRooms;
        this.userRooms = userRooms;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Chatroom> getCreatedRooms() {
        return createdRooms;
    }

    public void setCreatedRooms(List<Chatroom> createdRooms) {
        this.createdRooms = createdRooms;
    }

    public List<Chatroom> getUserRooms() {
        return userRooms;
    }

    public void setUserRooms(List<Chatroom> userRooms) {
        this.userRooms = userRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() && Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getCreatedRooms(), user.getCreatedRooms()) && Objects.equals(getUserRooms(), user.getUserRooms());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getLogin(), getPassword(), getCreatedRooms(), getUserRooms());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", createdRooms=" + createdRooms +
                ", userRooms=" + userRooms +
                '}';
    }
}
