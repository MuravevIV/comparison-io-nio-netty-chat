package com.ilyamur.comparison.ionionettychat.view;

import com.ilyamur.comparison.ionionettychat.*;
import com.ilyamur.comparison.ionionettychat.model.client.ClientModel;
import com.ilyamur.comparison.ionionettychat.model.client.ClientModelImpl;
import com.ilyamur.comparison.ionionettychat.model.server.ServerModel;
import com.ilyamur.comparison.ionionettychat.model.server.ServerModelImpl;
import com.ilyamur.comparison.ionionettychat.presenter.client.ClientPresenter;
import com.ilyamur.comparison.ionionettychat.presenter.client.ClientPresenterImpl;
import com.ilyamur.comparison.ionionettychat.presenter.server.ServerPresenter;
import com.ilyamur.comparison.ionionettychat.presenter.server.ServerPresenterImpl;

import javax.swing.*;

public class SwingView implements View {

    private JPanel panMain;
    private JTextArea chatTextArea;
    private JButton sendMessageButton;
    private JButton disconnectClientButton;
    private JButton joinClientButton;
    private JButton createServerButton;
    private JTextField ipAddressTextField;
    private JButton closeServerButton;
    private JTextArea messageTextArea;

    private ServerPresenter _serverPresenter;
    private ClientPresenter _clientPresenter;

    @Override
    public void setServerPresenter(ServerPresenter serverPresenter) {
        _serverPresenter = serverPresenter;
    }

    @Override
    public void setClientPresenter(ClientPresenter clientPresenter) {
        _clientPresenter = clientPresenter;
    }

    public static void main(String[] args) {
        //
        AppProperties appProperties = new AppProperties();
        SwingView view = new SwingView();
        //
        ServerModel serverModel = new ServerModelImpl(appProperties, null); // todo
        ServerPresenter serverPresenter = new ServerPresenterImpl(serverModel, view);
        //
        ClientModel clientModel = new ClientModelImpl(appProperties, null); // todo
        ClientPresenter clientPresenter = new ClientPresenterImpl(clientModel, view);
        //
        JFrame frame = new JFrame("chat");
        frame.setContentPane(view.panMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //
    }
}
