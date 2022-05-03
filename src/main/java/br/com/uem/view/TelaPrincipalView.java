package br.com.uem.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipalView extends javax.swing.JFrame {

    private JPanel telaPrincipal;
    private JButton cadastrosButton;
    private JButton emprestimosButton;
    private JButton faturamentoButton;
    private JButton relatoriosButton;
    private JButton sairButton;

    public TelaPrincipalView() {

        this.setSize(900, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(telaPrincipal);

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
