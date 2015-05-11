package com.ilyamur.comparison.ionionettychat.model.client;

import com.ilyamur.comparison.ionionettychat.AppProperties;
import com.ilyamur.comparison.ionionettychat.api.client.ClientFactory;

public class ClientModelImpl implements ClientModel {

    private final AppProperties _appProperties;
    private final ClientFactory _clientFactory;

    public ClientModelImpl(AppProperties appProperties, ClientFactory clientFactory) {
        _appProperties = appProperties;
        _clientFactory = clientFactory;
    }
}
