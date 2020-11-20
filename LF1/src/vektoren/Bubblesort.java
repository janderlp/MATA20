package vektoren;

import java.io.IOException;


import oop.IO;

public class Bubblesort {


	public static void main(String[] args) throws IOException {

		System.out.print("Wieviele zahlen wollen sie eingeben ? :");
		int laengezahlen = IO.readInteger();

		int [] zahlen = new int [laengezahlen];

		System.out.println(" ");
		System.out.println("geben sie nun die zahlen ein : ");
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = IO.readInteger();
		}

		for (int j = 0; j < laengezahlen + 1; j++) {


			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					int c = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = c;


				}

			}
		}
		System.out.println("Zahlen in der Reihenfolge : ");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + "; ");
		}
	}
}