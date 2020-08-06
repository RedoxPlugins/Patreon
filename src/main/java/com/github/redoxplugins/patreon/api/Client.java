package com.github.redoxplugins.patreon.api;

import com.patreon.PatreonOAuth;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URISyntaxException;

public class Client {

    @Getter
    private PatreonOAuth oauthClient;
    @Getter
    private PatreonOAuth.TokensResponse tokensResponse;

    private String code;

    @Getter
    private ClientConfig clientConfig;

    @Getter
    @Setter
    private PatreonEventListener eventListener;

    private Boolean running = false;

    public Client(ClientConfig config) {
        this.clientConfig = config;
    }

    public void login() throws IOException, URISyntaxException {

        if(running)
            return;

        this.oauthClient = new PatreonOAuth(this.clientConfig.getClientId(), this.clientConfig.getClientSecret(), this.clientConfig.getRedirectUrl());
        this.tokensResponse = oauthClient.getTokens("code");
        System.out.println("TEST");
    }

}
