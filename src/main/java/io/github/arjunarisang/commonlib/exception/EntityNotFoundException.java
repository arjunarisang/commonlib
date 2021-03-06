package io.github.arjunarisang.commonlib.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException() {
        super("Not Found.");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityNotFoundException(Throwable cause) {
        super(cause);
    }
}
