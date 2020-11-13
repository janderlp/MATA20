package wachstumsRechnung;

import oop.IO;

public class Sparvertrag {

	public static void main(String[] args) {

		do {
			System.out.println("wieviel Kapital benutzen sie ?");
			double kapital = IO.readDouble();


			System.out.println("Welchen Zinssatz bekommen sie ?");
			double zinsen = IO.readDouble();


			System.out.println("Wie lange soll die Laufzeit des Kontos sein ?");
			double laufzeit = IO.readDouble();

			double anfangskapital = kapital;
			double zinsbetrag = zinsen * 10;
			double endjahresbetrag = anfangskapital + (anfangskapital * (zinsen / 100));

			System.out.println("========================");
			System.out.println("Kapital = " + kapital + " €");
			System.out.println("Zinssatz = " + zinsen + " %");
			System.out.println("Laufzeit = " + laufzeit + " Jahre");
			System.out.println("========================");
			System.out.println("");

			System.out.println("Jahr\tAnfangskapital\tZinsbetrag\tJahresbetrag");
			for (int i = 1; i <= laufzeit; i++) {

				System.out.println(i + "\t" + String.format("%.2f", anfangskapital) + " €\t" + String.format("%.2f", zinsbetrag) + " €\t\t" + String.format("%.2f", endjahresbetrag) + " €");
				endjahresbetrag = endjahresbetrag + (anfangskapital * (zinsen / 100)) ;
				anfangskapital = anfangskapital + (anfangskapital * (zinsen / 100));
				zinsbetrag = anfangskapital * (zinsen / 100);
			}
			System.out.println("");
			System.out.println("========================");
			System.out.println("");
			System.out.println("wollen sie einen weieren sparvertrag berehnen?");
			
		} while (IO.readBoolean());



	}

}
