package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		System.out.println("Gebe dein Geschlecht ein (w,m)");
		String geschlecht = br.readLine();

		System.out.println("Gib dein Gewicht in kg ein");
		String eingabe2 = br.readLine();
		double gewicht = Double.parseDouble(eingabe2.trim().replace(',','.'));

		System.out.println("Gib deine Größe in cm ein");
		String eingabe3 = br.readLine();
		double groese = Double.parseDouble(eingabe3.trim().replace(',','.'));

		Double bmi = gewicht / (groese / 100 * groese / 100);

		if (geschlecht.contains("m")) {
			if (bmi < 20) {
				System.out.println("Untergewicht");
			} else if (20 <= bmi && bmi < 25) {
				System.out.println("Normalgewicht");
			} else if (25 <= bmi && bmi < 30) {
				System.out.println("Übergewicht");
			} else if (30 <= bmi && bmi < 40) {
				System.out.println("Adipositas");
			} else if (bmi >= 40) {
				System.out.println("Starke Adipositas");
			}
		} else if (geschlecht.contains("w")) {
			if (bmi < 19) {
				System.out.println("Untergewicht");
			} else if (19 <= bmi && bmi < 24) {
				System.out.println("Normalgewicht");
			} else if (24 <= bmi && bmi < 30) {
				System.out.println("Übergewicht");
			} else if (30 <= bmi && bmi < 40) {
				System.out.println("Adipositas");
			} else if (bmi >= 40) {
				System.out.println("Starke Adipositas");
			}
		}
	}
}