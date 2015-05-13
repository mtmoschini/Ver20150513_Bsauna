package gestionesauna;

import java.time.LocalDateTime;
import java.time.Duration;

public class Prenotazione {
	private int posti;
	private LocalDateTime oraArrivo;
	private LocalDateTime oraUscita;
	private Duration numeroOre;
	private double ricavo;
	
	public Prenotazione(int posti, LocalDateTime oraArrivo,
			LocalDateTime oraUscita, Duration numeroOre, double ricavo) {
		super();
		this.posti = posti;
		this.oraArrivo = oraArrivo;
		this.oraUscita = oraUscita;
		this.numeroOre = numeroOre;
		this.ricavo = ricavo;
	}
	
	public int getPosti() {
		return posti;
	}
	
	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}
	
	public LocalDateTime getOraUscita() {
		return oraUscita;
	}
	
	public Duration getNumeroOre() {
		return numeroOre;
	}
	
	public double getRicavo() {
		return ricavo;
	}
}
