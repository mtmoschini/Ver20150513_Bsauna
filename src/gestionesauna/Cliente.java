package gestionesauna;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	private String ID;
	
	public Cliente(String nome, String cognome, String email, String iD) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getID() {
		return ID;
	}
}
