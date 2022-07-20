package ex00;

import java.util.UUID;
import ex00.User;

public class Transaction {
    private enum TransferCategory {
        DEBIT,
        CREDIT
    }

    private UUID                identifier;
    private User                recipient;
    private User                sender;
    private int                 amount;
    private TransferCategory    category;

    public UUID getIdentifier() {
        return identifier;
    }

    public void setId(UUID identifier) {
        this.identifier = identifier;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (category == TransferCategory.CREDIT && amount < 0)
            this.amount = amount;
        else if (category == TransferCategory.DEBIT && amount > 0)
            this.amount = amount;
    }

    public TransferCategory getCategory() {
        return category;
    }

    public void setCategory(TransferCategory category) {
        this.category = category;
    }

    public Transaction(User sender, User recipient, int amount, UUID identifier) {
        this.identifier = identifier;
        this.recipient = recipient;
        this.sender = sender;

        if (sender.getBalance() < amount) {
            System.out.println("Sender don't have enough money");
            System.exit(0);
        }

        this.amount = amount;
    }
}