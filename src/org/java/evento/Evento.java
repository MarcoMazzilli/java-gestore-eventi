package org.java.evento;

import java.time.LocalDate;


public class Evento {

	
	private String titolo;
	private LocalDate dataEvento;
	private int nPostiTotale;
	private int nPostiPrenotati;
	
	public Evento(){
		
	}
	
	public Evento(String titolo, LocalDate dataEvento, int nPostiTotale) throws Exception {
		
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
	
	public void setDataEvento(LocalDate dataEvento) throws Exception {
		
		LocalDate today = LocalDate.now();
		
		if(dataEvento.compareTo(today)>= 0) {
			this.dataEvento = dataEvento;			
		}else {
			throw new Exception("Inserire una data valida");
		}
	}
	
	public int getnPostiTotale() {
		return nPostiTotale;
	}
	
	private void setnPostiTotale(int nPostiTotale) throws Exception {
		
		if(nPostiTotale == 0) {
			throw new Exception("Il numero dei posti disponibili deve essere maggiore di 0");
		}else if(nPostiTotale < 0){
			throw new Exception("Numeri negativi non accettati");
		}
		
		this.nPostiTotale = nPostiTotale;
	}
	
	public int getnPostiPrenotati() {
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
			throw new Exception("Non ci sono prenotazioni da disdire");
		}
		this.nPostiPrenotati--;
	}
	
	@Override
	public String toString() {

		return "Titolo Evento: " + getTitolo() + "\n"
			+ "Data Evento: "	+ getDataEvento() + "\n"
			+ "Tot. posti evento: "	+ getnPostiTotale() + "\n"
			+ "Tot prenotati: "	+ getnPostiPrenotati() + "\n"
			+ "N. posti disonibili: " + (getnPostiTotale()-getnPostiPrenotati())
			
		;
	}
	
	
}
