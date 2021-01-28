package io.github.arjunarisang.commonlib.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "arjunarisang.commonlib")
public class FeignProperties {

    private final Feign feign = new Feign();

    public Feign getFeign() {
        return this.feign;
    }

    public static final class Feign {
        private boolean enabled = false;

        public Feign() {
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Feign)) return false;
            final Feign other = (Feign) o;
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
            return "FeignProperties.Feign(enabled=" + this.isEnabled() + ")";
        }
    }
}
