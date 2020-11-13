package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wurzel {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		System.out.println("Gebe die erste zahl an");
		String eingabe1 = br.readLine();
		double wert1 = Double.parseDouble(eingabe1.trim().replace(',','.'));


		System.out.println("gebe die endzahl ein");
		String eingabe2 = br.readLine();
		double wert2 = Double.parseDouble(eingabe2.trim().replace(',','.'));

		for (double i = wert1; i <= wert2; i++) {
			System.out.println(i + "--" + Math.round(Math.sqrt(i)*100.0)/100.0);
		}
	}
}
