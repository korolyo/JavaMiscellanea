package ex02;

public class User {
    private int identifier;
    private String name;
    private int balance;

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(int identifier, String name, int balance) {
        this.identifier = identifier;
        this.name = name;
        this.balance = balance;
        if (balance < 0)
            System.out.println("Negative balance");
    }
}