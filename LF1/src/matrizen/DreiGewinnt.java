package matrizen;

import oop.IO;

public class DreiGewinnt {

	public static void main(String[] args) {

		erzeugeSpielfeld();
		anzeigeSpielfeld(null);


	}

	public static String[][] erzeugeSpielfeld(){

		System.out.print("wie viele Ticks soll das spielfeld werden? : ");
		int x1 = IO.readInteger();
		int x2 = x1;

		System.out.println(" ");

		String[][] spielfeld = new String[x1][x2];


		
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				spielfeld[i][j] = "O";
			}
		}
		System.out.println("=============================================");
		System.out.println(" ");

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				System.out.print(spielfeld[i][j] + "\t");
			}
			System.out.println("");
		}
		return spielfeld;
	}

	public static void anzeigeSpielfeld(String[][] spielfeld){
		
		System.out.println("=============================================");
		System.out.println(" ");

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				System.out.print(spielfeld[i][j] + "\t");
			}
			System.out.println("");
		}
	}		
}