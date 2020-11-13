package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bestellung {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		System.out.println("Gib ein wieviele Schrauben du kaufen willst: ");;
		String eingabe1 = br.readLine();
		int schrauben = Integer.parseInt(eingabe1.trim().replace(',','.'));

		System.out.println("Gib ein wieviele Muttern du kaufen willst: ");
		String eingabe2 = br.readLine();
		int muttern = Integer.parseInt(eingabe2.trim().replace(',','.'));
		
		System.out.println("Gib zuletzt an wieviele Unterlegscheiben du kaufen willst");
		String eingabe3 = br.readLine();
		int unterlegscheiben = Integer.parseInt(eingabe3.trim().replace(',','.'));
		
		if (schrauben == muttern) {
			System.out.println("Die Bestellung ist so möglich");
		}else {
			System.out.println("Überprüfe die Bestellung nochmal");
		}
		double summe = Math.round(schrauben * 0.05 + muttern * 0.03 + unterlegscheiben * 0.01);
		System.out.println("Der Preis dieser Bestellung beträgt gerundet: " + summe + "€");
	}

}
