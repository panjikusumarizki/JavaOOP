package programmer.command.line.error;

public class ValidationException extends Throwable{

    public ValidationException(String message) {
        super(message);
    }
}
