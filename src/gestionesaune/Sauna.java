package gestionesaune;

public class Sauna {

	private int numero;
	private int capienza;
	
	/**
	 * @param numero
	 * @param capienza
	 */
	public Sauna(int numero, int capienza) {
		super();
		
		if(numero != 0){
			this.numero = numero;
		}
		else{
			throw new IllegalArgumentException("Numero cannot be 0");
		}
		
		if(capienza != 0){
			this.capienza = capienza;
		}
		else{
			throw new IllegalArgumentException("Capienza cannot be 0");
		}
		
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * @return the capienza
	 */
	public int getCapienza() {
		return capienza;
	}
	
}
