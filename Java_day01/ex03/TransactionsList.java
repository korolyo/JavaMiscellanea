package ex03;

public interface TransactionList {
    public void                     addTransaction(Transaction transaction);
    public void                     removeTransactionById(UUID id);
    public ArrayList<Transaction>   toArray();
}