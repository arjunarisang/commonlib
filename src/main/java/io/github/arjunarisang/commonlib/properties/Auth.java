package io.github.arjunarisang.commonlib.properties;

import java.util.HashMap;
import java.util.Map;

public class Auth {
    private Map<String, Issuer> issuers = new HashMap<>();
    private Map<String, AuthDetail> openApi = new HashMap<>();

    public Auth() {
    }

    public Map<String, Issuer> getIssuers() {
        return this.issuers;
    }

    public Map<String, AuthDetail> getOpenApi() {
        return this.openApi;
    }

    public void setIssuers(Map<String, Issuer> issuers) {
        this.issuers = issuers;
    }

    public void setOpenApi(Map<String, AuthDetail> openApi) {
        this.openApi = openApi;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Auth)) return false;
        final Auth other = (Auth) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$issuers = this.getIssuers();
        final Object other$issuers = other.getIssuers();
        if (this$issuers == null ? other$issuers != null : !this$issuers.equals(other$issuers)) return false;
        final Object this$openApi = this.getOpenApi();
        final Object other$openApi = other.getOpenApi();
        if (this$openApi == null ? other$openApi != null : !this$openApi.equals(other$openApi)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Auth;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $issuers = this.getIssuers();
        result = result * PRIME + ($issuers == null ? 43 : $issuers.hashCode());
        final Object $openApi = this.getOpenApi();
        result = result * PRIME + ($openApi == null ? 43 : $openApi.hashCode());
        return result;
    }

    public String toString() {
        return "Auth(issuers=" + this.getIssuers() + ", openApi=" + this.getOpenApi() + ")";
    }
}
