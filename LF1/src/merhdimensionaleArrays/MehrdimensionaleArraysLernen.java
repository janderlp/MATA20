package merhdimensionaleArrays;

import java.io.IOException;

import oop.IO;

public class MehrdimensionaleArraysLernen {

	public static void main(String[] args) throws IOException {
		
		auswahl(null);

	}
	
	public static void auswahl(String[] args) throws IOException {
		
		System.out.println("Wollen sie einen zwei, drei oder vierdimensionalen array erstellen und füllen?");
		System.out.print("Geben sie nur 2, 3, 4  oder  zwei, drei, vier ein: ");
		String antwort = IO.readString();
		
		if (antwort.equalsIgnoreCase("zwei") || antwort.equalsIgnoreCase("2")) {
			zweidiarr(null);
		}else if (antwort.equalsIgnoreCase("drei") || antwort.equalsIgnoreCase("3")) {
			dreidiarr(null);
		}else if (antwort.equalsIgnoreCase("vier") || antwort.equalsIgnoreCase("4")) {
			vierdiarr(null);
		}
	}

	public static void zweidiarr(int[][] args) {

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
		
		//
		
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

			}
		}

	}

	public static void dreidiarr(int[][][] args) {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie tief soll der Array werden?: ");
		int tiefe = IO.readInteger();

		int[][][] mehrarr = new int[laenge][breite][tiefe];
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
					System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
					mehrarr[i][j][j2] = IO.readInteger();
				}
			}			
		}
		
		//
		
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
					System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "]  hat den Wert ==> " + mehrarr[i][j][j2]);
				}
			}
		}
	}

	public static void vierdiarr(int[][][][] args) {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie tief soll der Array werden?: ");
		int tiefe = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie lang soll die 4te stelle im Array werden?: ");
		int vierte = IO.readInteger();

		int[][][][] mehrarr = new int[laenge][breite][tiefe][vierte];
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
					for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
						System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "][" + j3 + "]  den Wert ein: ");
						mehrarr[i][j][j2][j3] = IO.readInteger();
					}
				}
			}
			
		}
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		
		//
		
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
					for (int j3 = 0; j3 < mehrarr[i].length; j3++) {
						System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "][" + j3 + "]   hat den Wert ==> " + mehrarr[i][j][j2][j3]);
					}
				}
			}

		}
	}
}
