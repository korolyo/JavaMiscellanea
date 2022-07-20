package ex04.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
