package io.github.arjunarisang.commonlib.properties;

public class AuthDetail {
    private String authorizationUrl;
    private String tokenUrl;

    public AuthDetail() {
    }

    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthDetail)) return false;
        final AuthDetail other = (AuthDetail) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$authorizationUrl = this.getAuthorizationUrl();
        final Object other$authorizationUrl = other.getAuthorizationUrl();
        if (this$authorizationUrl == null ? other$authorizationUrl != null : !this$authorizationUrl.equals(other$authorizationUrl))
            return false;
        final Object this$tokenUrl = this.getTokenUrl();
        final Object other$tokenUrl = other.getTokenUrl();
        if (this$tokenUrl == null ? other$tokenUrl != null : !this$tokenUrl.equals(other$tokenUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthDetail;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $authorizationUrl = this.getAuthorizationUrl();
        result = result * PRIME + ($authorizationUrl == null ? 43 : $authorizationUrl.hashCode());
        final Object $tokenUrl = this.getTokenUrl();
        result = result * PRIME + ($tokenUrl == null ? 43 : $tokenUrl.hashCode());
        return result;
    }

    public String toString() {
        return "AuthDetail(authorizationUrl=" + this.getAuthorizationUrl() + ", tokenUrl=" + this.getTokenUrl() + ")";
    }
}
