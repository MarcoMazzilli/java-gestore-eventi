package org.java;


import java.time.LocalDate;
import java.util.Scanner;

import org.java.evento.Evento;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Evento ev1 = new Evento();
		
		// CREAZINE NUOVO EVENTO
			

		System.out.println("Inserisci il nome dell'evento: ");
		String nomeEvento = sc.nextLine();
				
		System.out.println("Inserisci la data nel seguente formato 'yyyy-mm-gg': ");
		LocalDate dataEvento = LocalDate.parse(sc.nextLine());
				
		System.out.println("Inserisci il N. di posti totali: ");
		int nPostiTotale = Integer.valueOf(sc.nextLine());
				
			try {
				
				ev1 = new Evento(nomeEvento, dataEvento, nPostiTotale);
						
			} catch (Exception e) {
						
				System.err.println(e.getMessage());	
						
			}
				
		System.out.println("\n" + ev1 + "\n");
		
		
			
		// AGGIUNTA PRENOTAZIONI EVENTO
		
		System.out.println("Quante prenotazioni vuoi aggiungere?");
		int nPrenotazioniDaAggiungere = Integer.valueOf(sc.nextLine());
				
			for (int i = 1; i < nPrenotazioniDaAggiungere+1; i++) {
					
				try {
						
					ev1.prenota();
						
				} catch (Exception e) {
						
					System.err.println("La prenotazione n. " + i + " non e stata inserita, evento al completo\n");
					System.err.println(e.getMessage());
						
					break;
				}
			}
			
			
			// DISDETTA PRENOTAZIONI EVENTO
				
				
			System.out.println("Quante prenotazioni vuoi disdire?");
			int prenotazioniDaDisdire = Integer.valueOf(sc.nextLine());
				
				
			for (int i = 0; i < prenotazioniDaDisdire; i++) {
					
				try {
					ev1.disdici();
					
				} catch (Exception e) {
						
					System.err.println(e.getMessage());
					break;
						
				}
					
			}
				
			System.out.println(ev1);
			sc.close();
				
				
		}
}
		
		

	
