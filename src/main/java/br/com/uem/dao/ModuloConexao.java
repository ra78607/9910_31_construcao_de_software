package br.com.uem.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModuloConexao {

    public static ModuloConexao conexao = null;

    public static ModuloConexao getInstance() {
        try {
            if (conexao == null || conexao.sqlConnection.isClosed()) {
                conexao = new ModuloConexao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public Connection sqlConnection;

    public ModuloConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String textoConexao = "jdbc:mysql://localhost/GerenciadordeEventosDb?user=admin&password=admin";

            //adquire a conexão
            sqlConnection = DriverManager.getConnection(textoConexao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}