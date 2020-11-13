package wachstumsRechnung;

import oop.IO;

public class Teperaturmessungen {

	public static void main(String[] args) {
		
		System.out.println("Geben sie an wieviele Tage sie berechnen wollen");
		int tage = IO.readInteger();
		
		double array[] = new double[tage];
		
		for (int i = 0; i < array.length; i++) {
			i = i+1;
			System.out.println("Geben sie die temperatur vom Tag " + i + " an");
			array[i] = IO.readDouble();
			i = i-1;
		}
		
		double summe = 0;
		for (int i = 0; i < array.length; i++) {
			summe = summe + array[i];
		}
		double mittelwert = summe / array.length;
		
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("");
		System.out.println("Der Mittelwert beträgt = " + String.format("%.1f", mittelwert) + "°C");
		System.out.println("Der höchste Wert ist = " + String.format("%.1f", max) + "°C");
	}

}
