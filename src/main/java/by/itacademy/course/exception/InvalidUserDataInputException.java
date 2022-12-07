package by.itacademy.course.exception;

public class InvalidUserDataInputException extends Exception {

    public static final String MESSAGE = "Invalid login or password entered";

    public InvalidUserDataInputException() {
        super(MESSAGE);
    }
}
