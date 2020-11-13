package scratch2Java;	

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {

	public static void main(String[] args) throws IOException {

		boolean isActive = true;

		while (isActive) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Gebe die l�nge der Seite a an");
				String a_eingabe = br.readLine();
				Double a = Double.parseDouble(a_eingabe.trim().replace(',','.'));

				System.out.println("gebe die Seitenl�nge von b an");
				String b_eingabe = br.readLine();
				Double b = Double.parseDouble(b_eingabe.trim().replace(',', '.'));

				System.out.println("Gebe zuletzt die L�nge der Seite c an");
				String c_eingabe = br.readLine();
				Double c = Double.parseDouble(c_eingabe.trim().replace(',', '.'));
				double u = a + b + c; 
				double s = u / 2;
				double f = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				//Satz des Heron (zu Berechnug der Fl�che ohne H�he)
				if (a + b > c) {
				}
				else {
					System.out.println("Die Erstellung dieses Dreiecks ist nicht m�glich");
					isActive = false;
					return;
				}
				if (b + c > a) {
				}
				else {
					System.out.println("Die Erstellung dieses Dreiecks ist nicht m�glich");
					isActive = false;
					return;
				}
				if (c + a > b) {	
				}
				else {
					System.out.println("Die Erstellung dieses Dreiecks ist nicht m�glich");
					isActive = false;
					return;
				}

				System.out.println("Es is M�glich das Dreieck zu Zeichen\n");
				System.out.println("Der Umfang dieses Dreiecks Betr�gt = " + u + " cm");
				System.out.println("Der Fl�cheninalt dieses Dreiecks betr�gt = " + f + " cm�\n");
				System.out.println("=======================================================");
			} catch (NumberFormatException e) {
				System.err.println("Bite geben sie nur Zahlen an. Keine Buchstaben oder Sonderzeichen.");
			}
		}
	}
}