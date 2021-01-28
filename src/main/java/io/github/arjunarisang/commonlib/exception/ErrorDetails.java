package io.github.arjunarisang.commonlib.exception;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public ErrorDetails() {
    }

    public static ErrorDetailsBuilder builder() {
        return new ErrorDetailsBuilder();
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ErrorDetails)) return false;
        final ErrorDetails other = (ErrorDetails) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ErrorDetails;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        return result;
    }

    public String toString() {
        return "ErrorDetails(timestamp=" + this.getTimestamp() + ", message=" + this.getMessage() + ", details=" + this.getDetails() + ")";
    }

    public static class ErrorDetailsBuilder {
        private Date timestamp;
        private String message;
        private String details;

        ErrorDetailsBuilder() {
        }

        public ErrorDetailsBuilder timestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ErrorDetailsBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ErrorDetailsBuilder details(String details) {
            this.details = details;
            return this;
        }

        public ErrorDetails build() {
            return new ErrorDetails(timestamp, message, details);
        }

        public String toString() {
            return "ErrorDetails.ErrorDetailsBuilder(timestamp=" + this.timestamp + ", message=" + this.message + ", details=" + this.details + ")";
        }
    }
}
