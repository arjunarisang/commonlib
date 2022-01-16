package io.github.arjunarisang.commonlib.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "arjunarisang.commonlib")
public class CommonlibProperties {

    private final ExceptionHandler exceptionHandler = new ExceptionHandler();

    public ExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    public static final class ExceptionHandler {
        private boolean enabled = false;

        public ExceptionHandler() {
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ExceptionHandler)) return false;
            final ExceptionHandler other = (ExceptionHandler) o;
            if (this.isEnabled() != other.isEnabled()) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.isEnabled() ? 79 : 97);
            return result;
        }

        public String toString() {
            return "ExceptionHandler(enabled=" + this.isEnabled() + ")";
        }
    }
}
