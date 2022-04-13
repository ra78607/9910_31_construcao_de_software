package br.com.uem.control;

public class LoginControl {

    public boolean isLoginValido(String username, String password){
        /*
        Aqui eu instanciaria um DAO para comparar o dado gravado com o
        digitado, mas estou com problemas no MySQL
        * */
        return (username == String.valueOf("A")) & (password == String.valueOf("A"));

}
