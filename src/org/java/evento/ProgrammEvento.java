package org.java.evento;

import java.util.ArrayList;
import java.util.List;

public class ProgrammEvento {
	
	 String titolo;
	 List <Evento> eventi;
	 
	 public ProgrammEvento(String titolo) {
		 
		 setTitolo(titolo);
		 setEventi();
		 
	 }
	 
	 
	 
	 // GETTER SETTER
	 
	public String getTitolo() {
		
		return titolo;
	}
	
	
	public void setTitolo(String titolo) {
		
		this.titolo = titolo;
	}
	
	
	public List<Evento> getEventi() {
		
		return eventi;
	}
	
	private void setEventi() {
		
		this.eventi =  new ArrayList<Evento>();
	}
	
	public void addEvento(Evento evento) {
		this.eventi.add(evento);
	}
	
	
	public List<Evento> getEventiDelGiorno(String data){
		
		List<Evento> eventiDelGiorno = new ArrayList<Evento>();
		
		for(Evento evento : this.eventi) {
			System.out.println("Miseria che casino!" + evento);
		}

		
		return eventiDelGiorno;
	}
	 
	 

}
