package gestionesaune;

import java.time.LocalDateTime;

public class MediaTemperatura extends Sauna{

	private int costo;
	private LocalDateTime orario;
	
	/**
	 * @param numero
	 * @param capienza
	 * @param costo
	 * @param orario
	 */
	public MediaTemperatura(int numero, int capienza, int costo,
			LocalDateTime orario) {
		super(numero, capienza);
		
		if(costo != 0){
			this.costo = costo;
		}
		else{
			throw new IllegalArgumentException("Costo cannot be 0");
		}
		
		if(orario != null){
			this.orario = orario;
		}
		else{
			throw new IllegalArgumentException("Orario cannot be nell");
		}
	}

	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}

	/**
	 * @return the orario
	 */
	public LocalDateTime getOrario() {
		return orario;
	}
	
}
