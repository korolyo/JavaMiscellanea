package ex02;

public interface UsersList {
    public void addUser(User user);
    public User retrieveUserById(UUID id);
    public User retrieveUserByIndex(int index);
    public int retrieveNumberOfUsers();
}