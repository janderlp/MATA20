package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenschema {

	public static void main(String[] args) throws IOException {

		System.out.println("Geben sie Ihre Prozentzahl ein:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eingabe = br.readLine();
		double prozent = Double.parseDouble(eingabe.trim().replace(',','.'));

		if (prozent >=85) {
			System.out.println(prozent + "% entspricht der Note 1");
		}
		else if (prozent >= 73) {
			System.out.println(prozent + "% entspricht der Note 2");
		}
		else if (prozent >= 59) {
			System.out.println(prozent + "% entspricht der Note 3");
		}
		else if (prozent >= 45) {
			System.out.println(prozent + "% entspricht der Note 4");
		}
		else if (prozent >= 27) {
			System.out.println(prozent + "% entspricht der Note 5");
		}
		else {
			System.out.println(prozent + "% entspricht der Note 6");
		}
	}
}