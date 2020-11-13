package trainingslager;

import oop.IO;

public class Ostern {

	public static void main(String[] args) {

		System.out.println("Bitte geben sie ein Jahr zwischen 1583 und 2199 an");

		int jahre = IO.readInteger();
		int m = 0;
		int n = 0;

		if(jahre >= 1583 && jahre <= 1699) {
			m = 23;
			n = 2;
		} else if (jahre >= 1700 && jahre <= 1799){
			m = 23;
			n = 3;
		} else if (jahre >= 1800 && jahre <= 1899) {
			m = 23;
		} else if (jahre >= 1900 && jahre <= 2099) {
			m = 24;
			n = 5;
		} else if (jahre >= 2100 & jahre <= 2199) {
			m = 24;
			n = 6;
		} else {
			m = 25;
			n = 0;
		}

		int a = jahre % 19;
		int b = jahre % 4;
		int c = jahre % 7;
		int d = (19 * a + m) % 30;
		int e = (2 * b + 4 * c + 6 * d + n) % 7;
		
		int ergebnis = (22 + d + e);
		int ergebnis2 = ( d + e - 9);
		
		
		if (ergebnis > 31) {
			System.out.println(ergebnis2 + " April");
			
		} else if( ergebnis <= 31) {
			System.out.println(ergebnis + " März");
		}
	}
}
