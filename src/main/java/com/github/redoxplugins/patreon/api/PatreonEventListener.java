package com.github.redoxplugins.patreon.api;

public interface PatreonEventListener {

    void onPledgeCreated();
    void onPledgeUpdated();
    void onPledgeDeleted();
}
