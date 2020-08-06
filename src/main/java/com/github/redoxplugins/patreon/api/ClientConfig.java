package com.github.redoxplugins.patreon.api;


import lombok.Getter;

public final class ClientConfig {

    @Getter
    private String clientId;
    @Getter
    private String clientSecret;
    @Getter
    private String accessToken;
    @Getter
    private String refreshToken;

    @Getter
    private String redirectUrl;

    public ClientConfig(String clientId, String clientSecret, String accessToken, String refreshToken, String redirectUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.redirectUrl = redirectUrl;
    }
}
