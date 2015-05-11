package com.ilyamur.comparison.ionionettychat.model.server;

import com.ilyamur.comparison.ionionettychat.api.server.ServerFactory;

public class ServerModelImpl implements ServerModel {

    private final ServerFactory _serverFactory;

    public ServerModelImpl(ServerFactory serverFactory) {
        _serverFactory = serverFactory;
    }

    @Override
    public void create(String port) {
        // todo
    }

    @Override
    public void close() {
        // todo
    }
}
