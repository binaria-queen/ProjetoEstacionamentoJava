package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidades.Contatos;
import interfaces.IDAO;

import utilidades.Conexoes;

public class DaoContatos implements IDAO<Contatos> {

	@Override
	public boolean salvar(Contatos obj) {
		String sql = "insert into contatos (nome, email)values(?, ?)";
		Connection con = Conexoes.conect();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getEmail());
			stm.execute();    //aplicação -> database
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		finally {
			Conexoes.closeConexao();
		}
		return true;
	}
	

	@Override
	public Contatos getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contatos> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Contatos obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
