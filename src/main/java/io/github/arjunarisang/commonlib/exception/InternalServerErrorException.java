package io.github.arjunarisang.commonlib.exception;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException() {
        super("Internal Error.");
    }

    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalServerErrorException(Throwable cause) {
        super(cause);
    }
}
