package ex02;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
