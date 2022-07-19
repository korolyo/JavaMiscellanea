package ex03;

include java.util.LinkedList;

public class TransactionsLinkedList implements TransactionsList {
    LinkedList<Transaction> transactionList = new LinkedList<Transaction>();
}