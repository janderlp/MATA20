package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Gebe die gewünschte Zahl an");
		String eingabe = br.readLine();
		long summe = Integer.parseInt(eingabe.trim().replace(',','.'));
		long output = 0;
		long i2 = 0;
		long output2 = 0;
		long i3 = 0;
		long output3 = 0;

		for (int i = 1; i < summe + 1; i++) {
			output = output + i;
		}
		System.out.println("Die Summe der eingegebenen Zahl beträgt = " + output + "(for schleife)");

		while (i2 <= summe) {
			output2 = output2 + i2;
			i2++;
		}
		System.out.println("Die summe der eingegebenen Zahl beträgt = " + output2 + "(while schleife)");

		do {
			output3 = output3 + i3;
			i3++;
		} while(i3 <= summe);
		System.out.println("Summe der do schleife = " + output3);
	}
}