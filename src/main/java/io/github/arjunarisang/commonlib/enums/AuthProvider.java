package io.github.arjunarisang.commonlib.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthProvider {

    GOOGLE("GOOGLE"),
    KEMENKEU("KEMENKEU"),
    KEMENKEU_PUBLIC("KEMENKEU_PUBLIC"),
    LOCAL("LOCAL"),
    KEYCLOAK("KEYCLOAK");

    @JsonValue
    private String authProvider;

    AuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getAuthProvider() {
        return this.authProvider;
    }
}
