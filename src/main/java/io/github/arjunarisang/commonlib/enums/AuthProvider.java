package io.github.arjunarisang.commonlib.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthProvider {

    GOOGLE("GOOGLE"),
    KEMENKEU("KEMENKEU"),
    LOCAL("LOCAL"),
    KEYCLOAK("KEYCLOAK");

    @JsonValue
    private String authProvider;

    private AuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getAuthProvider() {
        return this.authProvider;
    }
}
