package ex03;

public class TransactionNotFoundException extends RuntimeException {

    public TransactionNotFoundException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
