package com.ilyamur.comparison.ionionettychat.api.server;

import com.ilyamur.comparison.ionionettychat.api.FailureHandler;

import java.net.InetSocketAddress;

public interface Server {

    public void create(InetSocketAddress inetSocketAddress,
                       ServerCreateHandler serverCreateHandler,
                       FailureHandler failureHandler);

    public void close(ServerCloseHandler serverCloseHandler,
                      FailureHandler failureHandler);
}
