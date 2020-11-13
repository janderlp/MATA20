package taschenrechner;

public class TaschenrechnerOhneEingabe {

	public static void main(String[] args) {

		double zahl1 = 61.3;
		double zahl2 = 21.4;
		double summe = zahl1 + zahl2;
		double differenz = zahl1 - zahl2;
		double produkt = zahl1 * zahl2;
		double quotient = zahl1 / zahl2;

		System.out.println("Zahl1 = " + zahl1);
		System.out.println("Zahl2 = " + zahl2);
		System.out.println("Summe = " + summe);
		System.out.println("Differenz = " + differenz);
		System.out.println("Produkt = " + produkt);
		System.out.println("Quotient = " + quotient);
	}
}