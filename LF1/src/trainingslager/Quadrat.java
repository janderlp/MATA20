package trainingslager;

import oop.IO;

public class Quadrat {

	public static void main(String[] args) {

		System.out.println("Wie groﬂ soll das Quadrat werden?");
		int groesse = IO.readInteger();

		for (int i = 0; i < groesse; i++) {
			System.out.print("*");
		}	
		System.out.println("");
		for (int i = 0; i < groesse - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < groesse - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 0; i < groesse; i++) {

			System.out.print("*");
		}	
	}	
}