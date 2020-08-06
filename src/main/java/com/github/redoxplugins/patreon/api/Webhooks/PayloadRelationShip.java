package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class PayloadRelationShip {

    @JsonProperty("address")
    public Address Address;

    @JsonProperty("card")
    public PayloadCard Card;

    @JsonProperty("creator")
    public PayloadCreator Creator;

    @JsonProperty("links")
    public Map<String, String> Links;

    public class Address {
        @JsonProperty("data")
        public Object Data;
    }
}
