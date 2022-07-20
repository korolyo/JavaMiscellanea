package ex04.exceptions;

public class IllegalTransactionException extends RuntimeException {
    public IllegalTransactionException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
