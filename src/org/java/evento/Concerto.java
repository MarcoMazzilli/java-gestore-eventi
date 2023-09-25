package org.java.evento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Concerto extends Evento{
		
	private LocalTime orarioConcerto;
	private BigDecimal prezzoConcerto;
	
	public Concerto() {
		super();
		
		
	}
	
	
	
	public Concerto(String titolo, LocalDate dataEvento, int nPostiTotale, String orarioConcerto, BigDecimal prezzoConcerto) throws Exception {
		super(titolo, dataEvento, nPostiTotale);
		
		setOrarioConcerto(orarioConcerto);
		setPrezzoConcerto(prezzoConcerto);
	}

	// GETTER SETTER
	
	public LocalTime getOrarioConcerto() {
		return orarioConcerto;
	}

	public void setOrarioConcerto(String orarioConcerto) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime orarioFormattato = LocalTime.parse(orarioConcerto, formatter);
		
		this.orarioConcerto = orarioFormattato;
	}

	public BigDecimal getPrezzoConcerto() {
			
		return  this.prezzoConcerto;
	}

	public void setPrezzoConcerto(BigDecimal prezzoConcerto) {
		
		this.prezzoConcerto = prezzoConcerto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" 
				+ "Orario concerto: " + getOrarioConcerto() + "\n"
				+ "Prezzo concerto: " + getPrezzoConcerto() + " €";
	}
	

}

