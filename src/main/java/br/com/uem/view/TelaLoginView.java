package br.com.uem.view;

import br.com.uem.control.LoginControl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class TelaLoginView extends JFrame{

    private JPanel telaLogin;
    private JLabel loginLabel;
    private JTextField loginTextField;
    private JButton okButton;
    private JButton exitButton;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JFrame frame;

    public TelaLoginView(String titulo, LoginControl loginControl){

        super(titulo);
        this.setSize(450,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(telaLogin);

        JPasswordField passwordField = new javax.swing.JPasswordField();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                loginTextField.getText();
                okBtnActionPerformed(e, loginControl);
                //System.out.println("Login: " + loginTextField.getText());
                //System.out.println("Senha: " + passwordField.getText());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void okBtnActionPerformed(java.awt.event.ActionEvent event, LoginControl loginControl){
        String login = loginTextField.getText();
        String senha = new String(passwordField.getPassword());
        int tentativas = 0;


        if(loginControl.isLoginValido(login,senha)){
            telaLogin.setVisible(false);
            TelaPrincipalView telaPrincipal = new TelaPrincipalView();
            telaPrincipal.setVisible(true);
        }else{
            tentativas++;
            JOptionPane.showMessageDialog(null, "Login ou senha invalidos!");
        }

        if (tentativas >= 3){
            mostraMensagemTentativasExcedidas();
        }
    }

    private void mostraMensagemTentativasExcedidas() {
        JOptionPane.showMessageDialog(null, "Limite de 3 tentativas excedidas!");
        System.exit(0);
    }

}
