package ex02.user;

import java.util.UUID;

public interface UsersList {
    public void addUser(User user);
    public User retrieveUserById(UUID id);
    public User retrieveUserByIndex(int index);
    public int retrieveNumberOfUsers();
}