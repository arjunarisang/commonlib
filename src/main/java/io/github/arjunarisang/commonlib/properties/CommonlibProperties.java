package io.github.arjunarisang.commonlib.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "arjunarisang.commonlib")
public class CommonlibProperties {

    private final ExceptionHandler exceptionHandler = new ExceptionHandler();
    private final Feign feign = new Feign();

    public ExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    public Feign getFeign() {
        return this.feign;
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
            return "FeignProperties.ExceptionHandler(enabled=" + this.isEnabled() + ")";
        }
    }

    public static final class Feign {
        private boolean enabled = false;
        private String mofServiceUri = "https://localhost:8443";

        public Feign() {
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public String getMofServiceUri() {
            return this.mofServiceUri;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public void setMofServiceUri(String mofServiceUri) {
            this.mofServiceUri = mofServiceUri;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Feign)) return false;
            final Feign other = (Feign) o;
            if (this.isEnabled() != other.isEnabled()) return false;
            final Object this$mofServiceUri = this.getMofServiceUri();
            final Object other$mofServiceUri = other.getMofServiceUri();
            if (this$mofServiceUri == null ? other$mofServiceUri != null : !this$mofServiceUri.equals(other$mofServiceUri))
                return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.isEnabled() ? 79 : 97);
            final Object $mofServiceUri = this.getMofServiceUri();
            result = result * PRIME + ($mofServiceUri == null ? 43 : $mofServiceUri.hashCode());
            return result;
        }

        public String toString() {
            return "FeignProperties.Feign(enabled=" + this.isEnabled() + ", mofServiceUri=" + this.getMofServiceUri() + ")";
        }
    }
}
