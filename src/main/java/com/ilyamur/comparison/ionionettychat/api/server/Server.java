package com.ilyamur.comparison.ionionettychat.api.server;

import com.ilyamur.comparison.ionionettychat.api.FailureHandler;
import com.ilyamur.comparison.ionionettychat.api.OnConnectClientListener;
import com.ilyamur.comparison.ionionettychat.api.OnDisconnectClientListener;
import com.ilyamur.comparison.ionionettychat.api.OnReceiveMessageListener;

import java.net.InetSocketAddress;

public interface Server {

    public void create(InetSocketAddress inetSocketAddress,
                       ServerCreateHandler serverCreateHandler,
                       FailureHandler failureHandler);

    public void close(ServerCloseHandler serverCloseHandler,
                      FailureHandler failureHandler);

    public void onConnectClient(OnConnectClientListener onConnectClientListener);

    public void onDisconnectClient(OnDisconnectClientListener onDisconnectClientListener);

    public void onReceiveMessage(OnReceiveMessageListener onReceiveMessageListener);
}
