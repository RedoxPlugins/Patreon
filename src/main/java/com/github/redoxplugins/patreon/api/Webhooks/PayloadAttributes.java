package com.github.redoxplugins.patreon.api.Webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PayloadAttributes {

    @JsonProperty("amount_cents")
    public double Cents;

    @JsonProperty("pledge_cap_cents")
    public double CapCents;

    @JsonProperty("created_at")
    public String CreationDate;

    @JsonProperty("declined_since")
    public String DeclinedDate;

    @JsonProperty("patron_pays_fees")
    public Boolean PaysFees;
}
