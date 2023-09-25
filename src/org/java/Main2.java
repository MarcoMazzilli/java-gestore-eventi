package org.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import org.java.evento.Concerto;
import org.java.evento.Evento;
import org.java.evento.ProgrammEvento;

public class Main2 {
		
	public static void main(String[] args) {
		
		// CREAZIONE NUOVO CONCERTO
		
		Scanner sc = new Scanner(System.in);
		Evento c1 = new Concerto();
//		System.out.println("Inserisci il nome del concerto: ");
//		String name = sc.nextLine();
		String name = "maneskin";
		
//		System.out.println("Inserisci la data nel seguente formato 'yyyy-mm-gg': ");
//		LocalDate dataConcerto = LocalDate.parse(sc.nextLine());
		LocalDate dataConcerto = LocalDate.parse("2025-12-12");
		
//		System.out.println("Tot. posti disponibili");
//		int nPosti = Integer.valueOf(sc.nextLine());
		int nPosti = 1;
		
//		System.out.println("Inserisci il prezzo del biglietto (es. 24.50)");
//		String inputPrice = sc.nextLine();
//		BigDecimal price = new BigDecimal(inputPrice);
		BigDecimal price = new BigDecimal("24.50");
		
//		System.out.println("Inserisci l'ora di inizio concerto (es. 22:45)");
//		String orario = sc.nextLine();
		String orario = "22:45";
		
		try {
			c1 = new Concerto(name, dataConcerto, nPosti, orario, price);
			System.out.println("\n" + c1);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		ProgrammEvento n1 = new ProgrammEvento("Evento 1");

		System.out.println(n1.getEventi());
		
		
		
		sc.close();
	}
}
