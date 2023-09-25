package org.java.evento;

import java.time.LocalDate;


public class Evento {

	
	private String titolo;
	private LocalDate dataEvento;
	private int nPostiTotale;
	private int nPostiPrenotati;
	
	public Evento(String titolo, LocalDate dataEvento, int nPostiTotale) {
		
		setTitolo(titolo);
		setDataEvento(dataEvento);
		setnPostiTotale(nPostiTotale);
		setnPostiPrenotati(0);
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	
	public int getnPostiTotale() {
		return nPostiTotale;
	}
	
	public void setnPostiTotale(int nPostiTotale) {
		this.nPostiTotale = nPostiTotale;
	}
	
	private int getnPostiPrenotati() {
		return nPostiPrenotati;
	}
	
	private void setnPostiPrenotati(int nPostiPrenotati) {
		this.nPostiPrenotati = nPostiPrenotati;
	}
	
	public void prenota() throws Exception {
		
		if(nPostiPrenotati == nPostiTotale) {
			throw new Exception("Tutti i posti sono prenotati");
		}
		this.nPostiPrenotati++;
	}
	
	public void disdici() throws Exception {
		
		if (nPostiPrenotati == 0) {
			throw new Exception("Tutti i posti sono disponibili");
		}else {
			this.nPostiPrenotati--;
		}
	}
	
	@Override
	public String toString() {

		return "Titolo Evento: " + getTitolo() + "\n"
			+ "Data Evento: "	+ getDataEvento() + "\n"
			+ "Tot. posti: "	+ getnPostiTotale() + "\n"
			+ "Tot prenotati: "	+ getnPostiPrenotati() + ";"
			
		;
	}
	//prenota: aggiunge uno ai posti prenotati; se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione
	//disdici: riduce di uno i posti prenotati; se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione
	//l’override del metodo toString() in modo che venga restituita una stringa contenente: data formattata - titolo
	
	
}
