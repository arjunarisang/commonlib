package io.github.arjunarisang.commonlib.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException() {
        super("Bad Request.");
    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }
}
