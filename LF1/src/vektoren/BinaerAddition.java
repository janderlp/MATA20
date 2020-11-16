package vektoren;

import java.io.IOException;

import oop.IO;

public class BinaerAddition {

	public static void main(String[] args) throws IOException {

		System.out.println("Geben sie die erste Binärzahl ein");
		int[] zahl1 = IO.readIntegerArray1DBinaer();
		System.out.println("Geben sie nun die Zweite Binärzahl ein");
		int[] zahl2 = IO.readIntegerArray1D(zahl1.length);

		int[] ergebnis = new int[zahl1.length];

		for (int i = 0; i < ergebnis.length; i++) {
			
			if (zahl1[i] == 0 && zahl2[i] == 0) {
				ergebnis[i] = 0;
			}else if ((zahl1[i] == 1 && zahl2[i] == 0) || (zahl1[i] == 0 && zahl2[i] == 1)) {
				ergebnis[i] = 1;
			}else if (zahl1[i] == 1 && zahl2[i] == 1) {
				ergebnis[i] = 0;
				ergebnis[i + 1] = ergebnis [i + 1] + 1;
			}
		}
		System.out.println("");
		System.out.println("Ergebnis: ");
		for (int i = 0; i < ergebnis.length; i++) {
			
		
			System.out.println(ergebnis[i]);
		}
	}

}
