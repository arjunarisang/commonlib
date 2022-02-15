package io.github.arjunarisang.commonlib.properties;

import java.time.Duration;

public class Issuer {
    private String provider;
    private String issuerUri;
    private String jwksUri;
    private Duration jwkCacheTtl;

    public Issuer() {
    }

    public String getProvider() {
        return this.provider;
    }

    public String getIssuerUri() {
        return this.issuerUri;
    }

    public String getJwksUri() {
        return this.jwksUri;
    }

    public Duration getJwkCacheTtl() {
        return this.jwkCacheTtl;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setIssuerUri(String issuerUri) {
        this.issuerUri = issuerUri;
    }

    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    public void setJwkCacheTtl(Duration jwkCacheTtl) {
        this.jwkCacheTtl = jwkCacheTtl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Issuer)) return false;
        final Issuer other = (Issuer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$provider = this.getProvider();
        final Object other$provider = other.getProvider();
        if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) return false;
        final Object this$issuerUri = this.getIssuerUri();
        final Object other$issuerUri = other.getIssuerUri();
        if (this$issuerUri == null ? other$issuerUri != null : !this$issuerUri.equals(other$issuerUri)) return false;
        final Object this$jwksUri = this.getJwksUri();
        final Object other$jwksUri = other.getJwksUri();
        if (this$jwksUri == null ? other$jwksUri != null : !this$jwksUri.equals(other$jwksUri)) return false;
        final Object this$jwkCacheTtl = this.getJwkCacheTtl();
        final Object other$jwkCacheTtl = other.getJwkCacheTtl();
        if (this$jwkCacheTtl == null ? other$jwkCacheTtl != null : !this$jwkCacheTtl.equals(other$jwkCacheTtl))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Issuer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $provider = this.getProvider();
        result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
        final Object $issuerUri = this.getIssuerUri();
        result = result * PRIME + ($issuerUri == null ? 43 : $issuerUri.hashCode());
        final Object $jwksUri = this.getJwksUri();
        result = result * PRIME + ($jwksUri == null ? 43 : $jwksUri.hashCode());
        final Object $jwkCacheTtl = this.getJwkCacheTtl();
        result = result * PRIME + ($jwkCacheTtl == null ? 43 : $jwkCacheTtl.hashCode());
        return result;
    }

    public String toString() {
        return "Issuer(provider=" + this.getProvider() + ", issuerUri=" + this.getIssuerUri() + ", jwksUri=" + this.getJwksUri() + ", jwkCacheTtl=" + this.getJwkCacheTtl() + ")";
    }
}
