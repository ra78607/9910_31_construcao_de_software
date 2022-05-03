package br.com.uem.dao;

import br.com.uem.model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {

    public void Cadastrar(Cliente cliente){
        ModuloConexao conexao = new ModuloConexao();
        Connection dao = conexao.getInstance().sqlConnection;
        String query = "INSERT INTO cliente()('" + cliente.getId() + "', '" + cliente.getNome() + "','" + cliente.getDataNascimento() + "', '" + cliente.getCpf() + "', '" + cliente.getDataCadastro() + "', '" + cliente.getTelefone() + "', '" + cliente.getEndereco() + "', '" + cliente.getSituacao() + "');";
        try{
            Statement statement = dao.createStatement();
            statement.executeUpdate(query);
            dao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
