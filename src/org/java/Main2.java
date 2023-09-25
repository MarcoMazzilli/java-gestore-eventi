package org.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import org.java.evento.Concerto;

public class Main2 {
		
	public static void main(String[] args) {
		
		// CREAZIONE NUOVO CONCERTO
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del concerto: ");
		String name = sc.nextLine();
		
		System.out.println("Inserisci la data nel seguente formato 'yyyy-mm-gg': ");
		LocalDate dataConcerto = LocalDate.parse(sc.nextLine());
		
		System.out.println("Tot. posti disponibili");
		int nPosti = Integer.valueOf(sc.nextLine());
		
		System.out.println("Inserisci il prezzo del biglietto (es. 24.50)");
		String inputPrice = sc.nextLine();
		BigDecimal price = new BigDecimal(inputPrice);
		
		System.out.println("Inserisci l'ora di inizio concerto (es. 22:45)");
		String orario = sc.nextLine();
		
		try {
			Concerto c1 = new Concerto(name, dataConcerto, nPosti, orario, price);
			System.out.println("\n" + c1);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		sc.close();
	}
}
