package entidades;

public class Pessoa {
	private String nome;
	private String email;
	private String cpf;

	public Pessoa(){
		//System.out.println("chamou construtor");
	}

	public Pessoa(String nome) {
	   this.nome = nome;	
	}

	public Pessoa(String nome, String email, String cpf) {
		this.nome = nome;
		this.setEmail(email);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
		   this.cpf = cpf;
		}else {
			System.out.println("cpf inv�lido!");
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Email inv�lido!");
		}
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}
}


//modificador public -> fica vis�vel em todas as classes que instaciarem a classe
//modificador private -> fica vis�vel somente dentro da classe
