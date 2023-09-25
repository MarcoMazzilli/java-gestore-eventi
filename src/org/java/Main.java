package org.java;


import java.time.LocalDate;

import org.java.evento.Evento;

public class Main {
	
	public static void main(String[] args) {
		
		LocalDate eventDate = LocalDate.parse("2025-11-23");
		
		Evento ev1 = new Evento();
		System.out.println(ev1 + "\n");
		
		// TRY-CATCH VALORIZZAZIONE EVENTO;
		
		try {
			 ev1 = new Evento("Spettacolo", eventDate , 0);
			System.out.println(ev1);
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
		}
		
		//TRY-CATCH PRENOTA
		
		try {
			ev1.prenota();


		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		// TRY-CATCH DISDICI
		
//		try {
//			ev1.disdici();
//			
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
		System.out.println("\n--------------\n");
		System.out.println("updated: " + ev1);
	}

}
