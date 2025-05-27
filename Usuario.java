package FitChallenge;

public class Usuario { //Classe responsável por manipular dados do usuário (nome e email)
	
	//Atributos
	private String nome, email;
	
	//Métodos
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

}
