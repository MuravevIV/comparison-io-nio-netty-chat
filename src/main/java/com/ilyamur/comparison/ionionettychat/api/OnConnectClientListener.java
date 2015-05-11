package com.ilyamur.comparison.ionionettychat.api;

import com.ilyamur.comparison.ionionettychat.api.server.ClientToken;

public interface OnConnectClientListener {

    public void apply(ClientToken clientToken);
}
