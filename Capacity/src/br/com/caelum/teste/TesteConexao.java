package br.com.caelum.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.agenda.ConnectionFactory;



public class TesteConexao{
public static void main (String[] args) throws SQLException {
		
	Connection connection = new ConnectionFactory().getConnection();
	System.out.println("Conexao Aberta!");
	connection.close();

}
}