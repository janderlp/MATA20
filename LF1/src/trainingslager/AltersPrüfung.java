package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AltersPr�fung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte gib dein Alter an");
		String eingabe = br.readLine();
		int alter = Integer.parseInt(eingabe.trim().replace(',','.'));
		
		if (alter >= 18) {
			System.out.println("Du bist Vollj�hrig");
		}else {
			System.out.println("Du bist noch nicht Vollj�hrig");
		}
	}
		
}
