package com.ilyamur.comparison.ionionettychat.view;

import com.ilyamur.comparison.ionionettychat.presenter.client.ClientPresenter;
import com.ilyamur.comparison.ionionettychat.presenter.server.ServerPresenter;

interface View {

    void setServerPresenter(ServerPresenter serverPresenter);
    void setClientPresenter(ClientPresenter clientPresenter);
}
