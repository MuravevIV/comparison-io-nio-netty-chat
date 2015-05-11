package com.ilyamur.comparison.ionionettychat.api;

import com.ilyamur.comparison.ionionettychat.api.server.ClientToken;

public interface OnReceiveMessageListener {

    public void apply(ClientToken clientToken, String message);
}
