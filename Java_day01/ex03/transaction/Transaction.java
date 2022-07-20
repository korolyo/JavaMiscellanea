package ex03.transaction;

import ex03.user.User;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User recipient;
    private User    sender;
    private String  transferCategory;
    private int     amount;
    Transaction     next;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getTransferCategory() {
        return transferCategory;
    }

    public void setTransferCategory(String transferCategory) {
        this.transferCategory = transferCategory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(User recipient, User sender, String category, int amount) {
        this.recipient = recipient;
        this.sender = sender;
        this.category = category;
        this.amount = amount;

        if (category.equals("debit") && amount < 0)
            System.out.println("Amount can't be negative");
        if (category.equals("credit") && amount > 0)
            System.out.println("Amount can't be positive");
    }
}