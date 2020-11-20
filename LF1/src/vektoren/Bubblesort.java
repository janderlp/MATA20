package vektoren;

import java.io.IOException;


import oop.IO;

public class Bubblesort {


	public static void main(String[] args) throws IOException {

		System.out.print("Wieviele zahlen wollen sie eingeben ? : ");
		int laengezahlen = IO.readInteger();
		
		double[] zahlen = new double[laengezahlen];
		
		for(int i = 0; i < laengezahlen; i++) {
			zahlen[i] = Math.random() * 165762;
		}
		
		/*double[] zahlen = new double[laengezahlen];

		System.out.println(" ");
		System.out.println("geben sie nun die zahlen ein : ");
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = IO.readInteger();
		}*/

		for (int j = 0; j < laengezahlen + 1; j++) {


			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					double c = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = c;


				}

			}
		}
		
		
		System.out.println("Zahlen in aufsteigender Reihenfolge : ");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println( String.format("%.2f", zahlen[i]) + "; ");
		}
	}
}