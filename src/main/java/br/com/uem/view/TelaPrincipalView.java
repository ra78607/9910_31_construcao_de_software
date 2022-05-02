package br.com.uem.view;

import br.com.uem.control.LoginControl;

import javax.swing.*;

public class TelaPrincipalView extends javax.swing.JFrame {

    private JPanel telaPrincipal;
    private JButton cadastrosButton;
    private JButton emprestimosButton;
    private JButton faturamentoButton;
    private JButton relatoriosButton;

    public TelaPrincipalView() {
        this.setSize(900, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(telaPrincipal);
    }

}
