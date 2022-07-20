package ex03.transaction;

import java.util.ArrayList;
import java.util.UUID;

public interface TransactionsList {
    public void                     addTransaction(Transaction transaction);
    public void                     removeTransactionById(UUID id);
    public ArrayList<Transaction>   toArray();
}