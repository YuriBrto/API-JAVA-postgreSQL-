package Cadastros;

public class Pessoa {
	private int IdPessoa;
private String nomePessoa;
private String email;

public Pessoa() {
	
}

public Pessoa(String nomePessoa, String email) {
	super();
	this.nomePessoa = nomePessoa;
	this.email = email;
}

public Pessoa(int IdPessoa , String nomePessoa, String email) {
	super();
	this.IdPessoa=IdPessoa;
	this.nomePessoa = nomePessoa;
	this.email = email;
}

public int getIdPessoa() {
	return IdPessoa;
}

public void setIdPessoa(int idPessoa) {
	IdPessoa = idPessoa;
}

public String getNomePessoa() {
	return nomePessoa;
}

public void setNomePessoa(String nomePessoa) {
	this.nomePessoa = nomePessoa;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}
