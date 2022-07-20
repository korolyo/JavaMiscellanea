package ex04.exceptions;

public class TransactionNotFoundException extends RuntimeException {

    public TransactionNotFoundException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
