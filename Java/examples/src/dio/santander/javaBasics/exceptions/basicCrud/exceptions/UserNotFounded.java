package src.dio.santander.javaBasics.exceptions.basicCrud.exceptions;

public class UserNotFounded extends RuntimeException {
    public UserNotFounded(String message) {
        super(message);
    }
}
