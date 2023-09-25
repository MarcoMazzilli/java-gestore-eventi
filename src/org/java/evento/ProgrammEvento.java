package org.java.evento;

import java.time.LocalDate;
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
	public int getEventiCount() {
		
		return eventi.size();
	}
	
	private void setEventi() {
		
		this.eventi =  new ArrayList<Evento>();
	}
	
	public void addEvento(Evento evento) {
		this.eventi.add(evento);
	}
	
	public List<Evento> getEventiDelGiorno(LocalDate dataDaControllare){
		
		List<Evento> eventiDelGiorno = new ArrayList<Evento>();
		
		for(Evento evento : this.eventi) {
			
			Evento e = evento;
			
			if(dataDaControllare.isEqual(e.getDataEvento())) {
				
				eventiDelGiorno.add(e);
			}	
		}

		return eventiDelGiorno;
	}
	
	public void clearArrayList(String password) throws Exception {
		String authCode = "password";
		
		if(authCode.equals(password)) {
			this.eventi.clear();			
		}else {
			throw new Exception("Password Errata! Impossibile eliminare gli eventi. ");
		}
		
	}
	
	public void getProgrammInfo() {
	
		
		
		for(Evento event : eventi) {
			
			Evento e = event;
			
			String orarioConcerto = new String();
			
			if(e instanceof Concerto) {
				Concerto c = (Concerto) e;
				
				orarioConcerto = "" + c.getOrarioConcerto();
			}
			
			System.out.println(e.getDataEvento() + "[" + orarioConcerto + "]"
			+ " -> " + e.getTitolo());
		}
		
	}
	 
	 

}
