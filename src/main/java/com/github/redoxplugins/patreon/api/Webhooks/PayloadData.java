package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public final class PayloadData {

    @JsonProperty("attributes")
    public PayloadAttributes Attributes;

    @JsonProperty("id")
    public String Id;

    @JsonProperty("relationships")
    public List<PayloadRelationShip> RelationShips;




}
