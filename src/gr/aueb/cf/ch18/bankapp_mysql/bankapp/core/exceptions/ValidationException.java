package gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
