package vektoren;

import java.io.IOException;

import oop.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {

		
		System.out.print("Wie viele Unterschieliche Artikel haben Sie im Lager? ");
		int arrl = IO.readInteger();
		
		System.out.println(" ");
		
		String[] artikel = new String[arrl];
		Double[] preise = new Double[arrl];
		int[] anzahl = new int[arrl];

		System.out.println("Erfasen sie die einzelnen Artikelbezeichnungen");
		for (int i = 0; i < artikel.length; i++) {
			System.out.print("Artikel " + (i + 1) + ": ");
			artikel[i] = IO.readString();
		}
		System.out.println(" ");
		System.out.println("Erfasen sie jetzt den Einzepreis jedes Artikels:");
		
		for (int i = 0; i < preise.length; i++) {
			System.out.print("Preis des Artikels '" + artikel[i] + "': ");
			preise[i] = IO.readDouble();
		}
		System.out.println(" ");
		System.out.println("Erfassen sie jetzt die anzahl der einzelnen Artikel:");
		
		for (int i = 0; i < anzahl.length; i++) {
			System.out.print("Menge des Artikels '" + artikel[i] + "': ");
			anzahl[i] = IO.readInteger();
		}
		
		int anzahlartikel = 0;
		double preis = 0;
		for (int i = 0; i < anzahl.length; i++) {
			anzahlartikel = anzahlartikel + anzahl[i];
			preis = preis + (preise[i] * anzahl[i]);
		}
		
		System.out.println("======================================");
		System.out.println("In ihrem Lager befinden sich insgesamt " + anzahlartikel + " Artikel im Wert von " +  String.format("%.2f", preis) + " €.");
		
	}

}
