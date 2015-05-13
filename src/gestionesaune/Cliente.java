package gestionesaune;

import java.util.Vector;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String email;
	private String codice;
	private Vector<Prenotazione> prenotazioni;
	
	
	/**
	 * @param nome
	 * @param cognome
	 * @param email
	 * @param codice
	 * @param prenotazaioni
	 */
	public Cliente(String nome, String cognome, String email, String codice,
			Vector<Prenotazione> prenotazaioni) {
		super();
		
		if(nome != null){
			this.nome = codice;
		}
		else{
			throw new IllegalArgumentException("Nome cannot be null");
		}
		
		if(cognome != null){
			this.nome = cognome;
		}
		else{
			throw new IllegalArgumentException("Cognome cannot be null");
		}
		
		if(email != null){
			this.nome = email;
		}
		else{
			throw new IllegalArgumentException("Email cannot be null");
		}
		
		if(codice != null){
			this.nome = codice;
		}
		else{
			throw new IllegalArgumentException("codice cannot be null");
		}
		
		this.prenotazioni = new Vector<Prenotazione>();
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * @return the prenotazioni
	 */
	public Vector<Prenotazione> getPrenotazioni() {
		return this.prenotazioni;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", codice=" + codice + "]";
	}
	
}
