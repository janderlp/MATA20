package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultaet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Gebe die gewünschte Zahl an");
		String eingabe = br.readLine();
		int summe = Integer.parseInt(eingabe.trim().replace(',','.'));
		int output = 1;

		for (int i = 1; i < summe + 1; i++) {
			output = output * i;
		}
		System.out.println("Die Fakultaet der eingegebenen Zahl beträgt = " + output);
	}
}