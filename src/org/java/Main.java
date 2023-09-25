package org.java;


import java.time.LocalDate;

import org.java.evento.Evento;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello event!");
//		LocalDate eventDate = LocalDate.now();
		LocalDate eventDate = LocalDate.parse("2025-11-23");
		
		Evento ev1 = new Evento("Spettacolo", eventDate , 10);
		System.out.println(ev1);
		
		//TRY-CATCH PRENOTA
		
		try {
			ev1.prenota();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		// TRY-CATCH DISDICI
		
		try {
			ev1.disdici();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
