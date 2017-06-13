package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.agenda.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class ContatoDao {
	private Connection connection;

	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	



	public void adiciona(Contato contato) {
		try {
			String sql = "insert into tbl_funcionario (nome, cpf, ddd, telefone,id_contrato) values (?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getCpf());
			stmt.setString(3, contato.getDdd());
			stmt.setString(4, contato.getTelefone());
			stmt.setString(5, contato.getIdContrato());
			

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	

	}
}
	

