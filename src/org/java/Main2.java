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
		
		Evento c2 = new Concerto();
		String name2 = "bonobo";
		LocalDate dataConcerto2 = LocalDate.parse("2024-12-12");
		int nPosti2 = 1;
		BigDecimal price2 = new BigDecimal("24.50");
		String orario2 = "22:45";
		
		
		
		try {
			c1 = new Concerto(name, dataConcerto, nPosti, orario, price);
			c2 = new Concerto(name2, dataConcerto2, nPosti2, orario2, price2);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		ProgrammEvento n1 = new ProgrammEvento("Programma eventi");

		n1.addEvento(c1);
		n1.addEvento(c2);
		
		System.out.println(n1.getEventiDelGiorno(dataConcerto2));
		System.out.println("Programma eventi: \n" + n1.getEventiCount()+ " " + "Eventi programmati \n");
		try {
			n1.clearArrayList("password");			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Programma eventi: \n" + n1.getEventiCount()+ " " + "Eventi programmati \n");
		
		
		sc.close();
	}
}
