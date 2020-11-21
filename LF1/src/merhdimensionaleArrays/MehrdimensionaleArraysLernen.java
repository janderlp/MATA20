package merhdimensionaleArrays;

import oop.IO;

public class MehrdimensionaleArraysLernen {

	public static void main(String[] args) {
		
		
		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();
		
		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();
		
		int[][] mehrarr = new int [laenge][breite];
		System.out.println("============================");
		
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.print("Geben sie für [" + i + "][" + j + "] den Wert ein: ");
				mehrarr[i][j] = IO.readInteger();
			}
			
		}
		
		
		System.out.println("============================");
		
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.println("Der Array an der Stelle :[" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

			}
		}
		
	}

}
