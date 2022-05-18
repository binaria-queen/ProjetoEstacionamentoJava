package crud;

import java.util.List;
import dao.DaoContatos;
import entidades.Contatos;

public class Crud {

	public static void main(String[] args) {
		chamaSalvar();
	}
	public static void chamaSalvar() {
		Contatos.ct = new Contatos();
		ct.setNome("Angela Davis");
		ct.setEmail("angela@gmail.com");
		
		DaoContatos dc = new DaoContatos();
		if(dc.salvar(ct)) {
			System.out.println("Contato salvo com suuuucesso!");
		}
	}
}
