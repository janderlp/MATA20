package wachstumsRechnung;

import oop.IO;

public class ExponentiellesWachstum {

	public static void main(String[] args) {


		System.out.println("Geben sie die Startmenge der BakterienKultur an");
		double startmenge = IO.readDouble();

		System.out.println("Geben sie den Faktor ein um den sie täglich erhöhen wollen");
		double faktor = IO.readDouble();

		System.out.println("Wieviele Tage wollen sie gezeigt bekommen");
		double tage = IO.readDouble();

		int starttag = 0;
		System.out.println("");
		System.out.println("Tage\tZellmenge");

		
		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = startmenge * Math.pow(faktor, i);
			System.out.println(starttag + "\t" + ergebnis );
		}
	}

}
