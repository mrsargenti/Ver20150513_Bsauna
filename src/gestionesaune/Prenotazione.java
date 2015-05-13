package gestionesaune;

import java.time.LocalDateTime;
import java.util.Vector;

public class Prenotazione {

	private int postiRichiesti;
	private LocalDateTime oraArrivo;
	private LocalDateTime oraUscita;
	
	/**
	 * @param postiRichiesti
	 * @param oraArrivo
	 * @param oraUscita
	 */
	public Prenotazione(int postiRichiesti, LocalDateTime oraArrivo,
			LocalDateTime oraUscita) {
		super();
		
		if(postiRichiesti != 0){
			this.postiRichiesti = postiRichiesti;
		}
		else{
			throw new IllegalArgumentException("PostiRichiesti cannot be 0");
		}
		
		if(oraArrivo != null){
			this.oraArrivo = oraArrivo;
		}
		else{
			throw new IllegalArgumentException("OraArrivo cannot be null");
		}
		
		if(oraUscita != null){
			this.oraUscita = oraUscita;
		}
		else{
			throw new IllegalArgumentException("OraUscita cannot be null");
		}	
	}

	/**
	 * @return the postiRichiesti
	 */
	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	/**
	 * @return the oraArrivo
	 */
	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}

	/**
	 * @return the oraUscita
	 */
	public LocalDateTime getOraUscita() {
		return oraUscita;
	}

	public void numeroOre() {
		return;
	}
	
	public void ricavoComplessivo() {
		return;
	}
	
	public void addPrenotazione(Prenotazione p)
	{
		if(p == null)
			throw new IllegalArgumentException("Prenotazione cannot be null");
		this.prenotazioni.addElement(p);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prenotazione [postiRichiesti=" + postiRichiesti
				+ ", oraArrivo=" + oraArrivo + ", oraUscita=" + oraUscita + "]";
	}
	
}
