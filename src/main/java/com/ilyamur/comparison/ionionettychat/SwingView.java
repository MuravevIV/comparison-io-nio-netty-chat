package com.ilyamur.comparison.ionionettychat;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingView implements View {

    private JPanel panMain;
    /*
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtSum;
    private JTextField txtProduct;
    private JTextField txtLine;
    private JTextField txtLength;
    */
    private JTextArea chatTextArea;
    private JButton sendMessageButton;
    private JButton disconnectClientButton;
    private JButton joinClientButton;
    private JButton createServerButton;
    private JTextField ipAddressTextField;
    private JButton closeServerButton;
    private JTextArea messageTextArea;

    @Override
    public void setPresenter(final Presenter presenter) {
        /*
        txtA.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                presenter.eventChangedA();
            }
        });
        txtB.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                presenter.eventChangedB();
            }
        });
        txtLine.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                presenter.eventChangedLine();
            }
        });
        */
    }

    @Override
    public String getA() {
        // return txtA.getText();
        return null;
    }

    @Override
    public void setA(String a) {
        // txtA.setText(a);
    }

    @Override
    public String getB() {
        // return txtB.getText();
        return null;
    }

    @Override
    public void setB(String b) {
        // txtB.setText(b);
    }

    @Override
    public String getLine() {
        // return txtLine.getText();
        return null;
    }

    @Override
    public void setLine(String line) {
        // txtLine.setText(line);
    }

    @Override
    public void setSum(String sum) {
        // txtSum.setText(sum);
    }

    @Override
    public void setProduct(String product) {
        // txtProduct.setText(product);
    }

    @Override
    public void setLength(String length) {
        // txtLength.setText(length);
    }

    public static void main(String[] args) {
        //
        AppProperties appProperties = new AppProperties();
        Model model = new ModelImpl(appProperties);
        SwingView view = new SwingView();
        PresenterImpl presenter = new PresenterImpl(model, view);
        //
        JFrame frame = new JFrame("chat");
        frame.setContentPane(view.panMain);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //
        presenter.eventInitialized();
    }
}
