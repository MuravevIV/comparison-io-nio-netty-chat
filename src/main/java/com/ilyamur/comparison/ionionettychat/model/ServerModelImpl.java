package com.ilyamur.comparison.ionionettychat.model;

import com.ilyamur.comparison.ionionettychat.api.FailureHandler;
import com.ilyamur.comparison.ionionettychat.api.server.*;

import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicReference;

public class ServerModelImpl implements ServerModel {

    private final ServerFactory _serverFactory;
    private AtomicReference<Server> _serverRef;

    public ServerModelImpl(ServerFactory serverFactory) {
        _serverFactory = serverFactory;
    }

    @Override
    public void create(InetSocketAddress inetSocketAddress,
                       ServerOpenHandler serverOpenHandler,
                       FailureHandler failureHandler) {
        // todo
    }

    @Override
    public void close(ServerCloseHandler serverCloseHandler,
                      FailureHandler failureHandler) {
        // todo
    }
}
