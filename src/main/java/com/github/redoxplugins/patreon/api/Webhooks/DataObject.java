package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class DataObject {

    @JsonProperty("id")
    public String Id;
    @JsonProperty("type")
    public String Type;
}
