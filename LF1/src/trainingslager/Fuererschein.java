package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuererschein {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Gebe dein Alter an");
		String eingabe = br.readLine();
		int alter = Integer.parseInt(eingabe.trim().replace(',','.'));
		
		if (alter < 14) {
			System.out.println("Du darfst Bobby-Car oder Fahrrad fahren.");
		} else if (alter >= 14 && alter < 16) {
			System.out.println("Du darfst schon 50er fahren.");
		} else if (alter >= 16 && alter < 18) {
			System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
		} else if (alter >= 18) {
			System.out.println("Du darfst Auto fahren");
		}

	}

}
