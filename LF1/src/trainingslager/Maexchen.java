package trainingslager;

import oop.IO;

public class Maexchen {

	public static void main(String[] args) {
		
		System.out.println("Geben sie die erste Augenzahl ein");
		int zahl1 = IO.readInteger();
		System.out.println("Geben sie die zweite Augenzahl ein");
		int zahl2 = IO.readInteger();
		int summe;
		
		
		if (zahl1 == 1 && zahl2 == 2 || zahl2 == 1 && zahl1 == 2) {
			summe = 1000;
			System.out.println("Du hast Mäxchen bekommst = " + summe + " Punkte");
		}
		if (zahl1 == zahl2) {
			summe = 100 * zahl1;
			System.out.println("Du hast einen Pasch du bekommst = " + summe + " Punkte");
		}
		if (zahl1 != zahl2) {
			if (zahl1 < zahl2) {
				summe = (zahl2 * 10) + zahl1;
				System.out.println("Du hast nichts bekommst aber trotzdem = " + summe + " Punkte");
			} else if (zahl1 > zahl2 && zahl1 == zahl2) {
				summe = (zahl1 * 10) + zahl2;
				System.out.println("Du hast nichts bekommst aber trotzdem = " + summe + " Punkte");
			}
		}
	}
}