package projectzero;

import oop.IO;

public class ProjectZero {

	public static void main(String[] args) {
		
		
	}

	
	public static void wachstum(String[] args) {
		System.out.println("Geben sie die Startmenge an");
		double startmenge = IO.readDouble();

		System.out.println("Geben sie den Faktor ein um den sie täglich erhöhen wollen");
		double faktor = IO.readDouble();

		System.out.println("Wieviele Tage wollen sie angezeigt bekommen");
		double tage = IO.readDouble();

		int starttag = 0;
		System.out.println("");
		System.out.println("Tage\tWachstumswert");

		
		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = startmenge * Math.pow(faktor, i);
			System.out.println(starttag + "\t" + ergebnis );
		}
	}
	
	/*public static void zerfall(String[] args) {
		System.out.println("Geben sie die Startmenge an");
		double startmenge = IO.readDouble();

		System.out.println("Geben sie den Faktor ein");
		double faktor = IO.readDouble();

		System.out.println("Wieviele Tage wollen sie angezeigt bekommen");
		double tage = IO.readDouble();

		int starttag = 0;
		System.out.println("");
		System.out.println("Tage\tZerfallswert");
		
		
		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = startmenge * Math.pow(faktor, i);
			System.out.println(starttag + "\t" + ergebnis);			
		}
	}*/
	
	
	public static void quadratischefunktion(String[] args) {
		
		System.out.println("sie haben im Moment die gleichung = ax² + bx + c");
		System.out.println("geben sie für a,b und c ihre werte ein");

		System.out.print("a = ");
		double a = IO.readDouble();

		System.out.print("b = ");
		double b = IO.readDouble();

		System.out.print("c = ");
		double c = IO.readDouble();

		System.out.println("Ihre aktuelle Formel ist = " + a + "x²" + b + "x" + c);

		double p = b / a;
		double q = c / a;

		System.out.println("Ihre PQ_Funktion Lautet = x² " + p + " x + " + q);

		double x1 = -(p/2) + Math.sqrt(((p/2) * (p/2)) - q);

		double x2 = -(p/2) - Math.sqrt(((p/2) * (p/2)) - q);


		double d = ((p/2) * (p/2) - q);

		if (d < 0) {
			System.out.println("es gibt keine Nullstellen");
		} else if (d == 0){
			System.out.println("es gibt eine Nullstelle = x1: " + x1);
		} else if (d > 0) {
			System.out.println("es gibt 2 Nullstellen = x1: " + x1 + " x2: " + x2);
		}
		
	}
	public static void arithmittel (String[] args) {
		
		System.out.println("Geben sie die anzahl der Daten ein die sie ingeben wollen: ");
		int laenge = IO.readInteger();
		
		double [] zahlenreihe = new double [laenge];
		
		for (int i = 0; i < zahlenreihe.length; i++) {
			System.out.println("geben sie den " + (i + 1) + " Wert ein: ");
			zahlenreihe[i] = IO.readDouble();
		}
		double summe = 0;
		for (int i = 0; i < zahlenreihe.length; i++) {
			summe = summe + zahlenreihe[i];
		}
		double arithmet = summe / laenge;
		
		
		System.out.println(arithmet);
		
		
	}
	
	public static void ungewogengeometrisch () {
		
		
		
		
	}
	public static void gewogengeometrischabs () {
		
	}
	public static void gewogengeometrischrel () {
		
	}
	
}
