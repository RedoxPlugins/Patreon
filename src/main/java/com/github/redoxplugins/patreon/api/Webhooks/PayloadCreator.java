package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PayloadCreator {

    @JsonProperty("data")
    public DataObject Data;
}
