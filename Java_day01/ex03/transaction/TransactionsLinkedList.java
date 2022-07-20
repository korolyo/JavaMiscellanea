package ex03.transaction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {
    LinkedList<Transaction> transactionList = new LinkedList<Transaction>();

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public void removeTransactionById(UUID id) {

    }

    @Override
    public ArrayList<Transaction> toArray() {
        return null;
    }
}