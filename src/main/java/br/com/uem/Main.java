package br.com.uem;

import br.com.uem.control.LoginControl;
import br.com.uem.view.TelaLoginView;
import br.com.uem.view.TelaPrincipalView;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //System.out.println("Teste");
        //JFrame frame = new TelaLoginView("Login");
        //frame.setVisible(true);

        LoginControl loginControl = new LoginControl();
        JFrame login = new TelaLoginView("Login", loginControl);
        login.setVisible(true);

        if (loginControl.isUsuarioLogado()){
            login.setVisible(false);
            TelaPrincipalView tela = new TelaPrincipalView();
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
        }
    }
}

/*
* git add ~nome arquivo-
* git commit -m "mensagem"
* git push
*
* git fetch "compara o que tem de diferente do repositorio pro meu"
* git pull "baixa as coisas"
* */