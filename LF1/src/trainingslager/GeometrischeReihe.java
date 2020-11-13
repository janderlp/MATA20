package trainingslager;

import java.io.IOException;
import oop.IO;

public class GeometrischeReihe {
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Gebe die Zahl an bis wohin sie die GeometrischeReihe berechnen wollen");
		double summe = IO.readDouble();
		double entwert = 0;
		double ergebnis = 0;
		
		for (int i = 0; i <= summe; i++) {
			entwert = 1 / Math.pow(2, i);
			ergebnis = ergebnis + entwert; 
		}
		System.out.println("Das ergebnis beträgt = " + ergebnis);

	}

}
