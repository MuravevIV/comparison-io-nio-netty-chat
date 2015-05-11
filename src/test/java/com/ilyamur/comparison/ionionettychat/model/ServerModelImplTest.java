package com.ilyamur.comparison.ionionettychat.model;

import com.ilyamur.comparison.ionionettychat.api.server.ServerFactory;
import org.junit.Before;
import org.junit.Test;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.*;

public class ServerModelImplTest {

    private static final InetSocketAddress INET_SOCKET_ADDRESS = new InetSocketAddress(1223);

    private ServerModel serverModel;
    private ServerFactory mockServerFactory;

    @Before
    public void before() {
        mockServerFactory = mock(ServerFactory.class);
        serverModel = new ServerModelImpl(mockServerFactory);
    }

    @Test
    public void test() {
        //
    }
}
