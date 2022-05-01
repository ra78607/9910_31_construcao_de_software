package br.com.uem.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLoginView extends JFrame{

    private JPanel telaLogin;
    private JLabel loginLabel;
    private JTextField loginTextField;
    private JButton okButton;
    private JButton exitButton;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JFrame frame;

    public TelaLoginView(String titulo){

        super(titulo);
        this.setSize(450,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(telaLogin);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                loginTextField.getText();

                System.out.println("Login: " + loginTextField.getText());
                System.out.println("Senha: " + passwordField.getText());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
