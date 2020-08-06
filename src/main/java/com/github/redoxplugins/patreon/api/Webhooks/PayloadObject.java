package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PayloadObject {

    @JsonProperty("data")
    public PayloadData Data;

}
