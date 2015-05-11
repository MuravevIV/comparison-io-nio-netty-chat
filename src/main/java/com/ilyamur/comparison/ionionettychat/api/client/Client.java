package com.ilyamur.comparison.ionionettychat.api.client;

import com.ilyamur.comparison.ionionettychat.api.FailureHandler;
import com.ilyamur.comparison.ionionettychat.api.OnConnectClientListener;
import com.ilyamur.comparison.ionionettychat.api.OnDisconnectClientListener;
import com.ilyamur.comparison.ionionettychat.api.OnReceiveMessageListener;

import java.net.InetAddress;

public interface Client {

    public void connect(InetAddress inetAddress,
                        ClientConnectHandler clientConnectHandler,
                        FailureHandler failureHandler);

    public void sendMessage(String message,
                            ClientSendMessageHandler clientSendMessageHandler,
                            FailureHandler failureHandler);

    public void disconnect(ClientDisconnectHandler clientDisconnectHandler,
                           FailureHandler failureHandler);

    public void onConnectClient(OnConnectClientListener onConnectClientListener);

    public void onDisconnectClient(OnDisconnectClientListener onDisconnectClientListener);

    public void onReceiveMessage(OnReceiveMessageListener onReceiveMessageListener);
}
