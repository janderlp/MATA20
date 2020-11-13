package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		int weiter = 0;
		do {
			
			menueausgabe();
			String rechenzeichen = br.readLine();
			System.out.println("Deine Auswahl = " + rechenzeichen);

			if (rechenzeichen.contains("w")) {
				w();
			}
			else {

				zahlenabfrage();
				String eingabe1 = br.readLine();
				double zahl1 = Double.parseDouble(eingabe1.trim().replace(',','.'));

				zahlenabfrage();
				String eingabe2 = br.readLine();
				double zahl2 = Double.parseDouble(eingabe2.trim().replace(',','.'));
				double summe = zahl1 + zahl2;
				double differenz = zahl1 - zahl2;
				double produkt = zahl1 * zahl2;
				double quotient = zahl1 / zahl2;
				double p = Math.pow(zahl1, zahl2);
				double w = Math.sqrt(zahl1);
				if (rechenzeichen.contains("+") ) {
					striche();
					System.out.println("Zahl1 = " + eingabe1);
					System.out.println("Zahl2 = " + eingabe2);
					System.out.println("Summe = " + summe);
					striche();
				}
				else if (rechenzeichen.contains("-")) {
					striche();
					System.out.println("Zahl1 = " + eingabe1);
					System.out.println("Zahl2 = " + eingabe2);
					System.out.println("Differenz = " + differenz);
					striche();
				}
				else if (rechenzeichen.contains("*")) {
					striche();
					System.out.println("Zahl1 = " + eingabe1);
					System.out.println("Zahl2 = " + eingabe2);
					System.out.println("Produkt = " + produkt);
					striche();
				}
				else if (rechenzeichen.contains("/")) {
					striche();
					System.out.println("Zahl1 = " + eingabe1);
					System.out.println("Zahl2 = " + eingabe2);
					System.out.println("Quotient = " + quotient);
					striche();
				}
				else if (rechenzeichen.contains("p")) {
					striche();
					System.out.println("Potenziert = " + p);
					striche();
				}
				else if (rechenzeichen.contains("w")) {
					striche();
					System.out.println("Wurzel ergibt = " + w);
					striche();
				}
			}
			System.out.println("Wenn sie noch eine rechnung durchführen wollen drücken sie bitte *1* ");
			String wiederholung= br.readLine();
			weiter = Integer.parseInt(wiederholung.trim().replace(',','.'));
		}while (weiter == 1);
		if(weiter != 1) {
			System.out.println("Der Vorgang wird abgebrochen, keine weitere Rechnung möglich. Programm Neustarten falls neue Rechnung erwünscht.");
		}
	}
	private static void zahlenabfrage() {
		System.out.println("Gebe die gewünschte Zahl zwischen 1 und 100 an (kommazahlen sind erlaubt)");
	}
	private static void menueausgabe() {
		System.out.println("Bitte geben sie das Rechnungszeichen an womit sie rechnen wollen (kein Wörter nur die +,-,*,/ zeichen)");
		System.out.println("sie haben folgende Möglichkeiten");
		System.out.println("[+] Addition,[-] Subtraktion, [*] Multiplikation, [/] Division, [p] Potenzieren, [w] Wurzelziehen");
	}
	private static void striche() {
		System.out.println("===================");
	}
	private static void w() throws IOException {
		zahlenabfrage();
		String eingabe1 = br.readLine();
		double zahl1 = Double.parseDouble(eingabe1.trim().replace(',','.'));
		double w = Math.sqrt(zahl1);

		striche();
		System.out.println("Wurzel ergibt = " + w);
		striche();
	}
}