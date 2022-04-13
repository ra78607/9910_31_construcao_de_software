package br.com.uem;

import br.com.uem.view.TelaLoginView;
import br.com.uem.view.TelaPrincipalView;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //System.out.println("Teste");
        JFrame frame = new TelaLoginView("Login");
        frame.setVisible(true);
    }
}
