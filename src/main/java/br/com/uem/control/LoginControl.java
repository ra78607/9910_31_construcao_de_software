package br.com.uem.control;

import java.util.Locale;

public class LoginControl {

    private boolean usuarioLogado;

    public boolean isLoginValido(String username, String password){
        /*
        Aqui eu instanciaria um DAO para comparar o dado gravado com o
        digitado, mas estou com problemas no MySQL
        * */
        //System.out.println( "isLoginValido " + username.toUpperCase() + " >> " + password.toUpperCase());
        //System.out.println(username.toUpperCase()=="A");
        //System.out.println(username.toUpperCase().equals("A"));
        if ((username.toUpperCase().equals("A")) && (password.toUpperCase().equals("A"))){
            usuarioLogado = true;
        }else{
            usuarioLogado = false;
            return false;
        }
        return true;
    }
    public boolean isUsuarioLogado(){
        return usuarioLogado;
    }
}
