package merhdimensionaleArrays;

import java.io.IOException;

import oop.IO;

public class MehrdimensionaleArraysLernen {

	public static void main(String[] args) throws IOException {
		
		auswahl(null);

	}
	
	public static void auswahl(String[] args) throws IOException {
		
		System.out.println("Wollen sie einen zwei, drei oder vierdimensionalen array erstellen und f�llen?");
		System.out.print("Geben sie nur 2, 3, 4  oder  zwei, drei, vier ein: ");
		String antwort = IO.readString();
		
		
		if (antwort.equalsIgnoreCase("zwei") || antwort.equalsIgnoreCase("2")) {
			zweidiarr(antwort);
		}else if (antwort.equalsIgnoreCase("drei") || antwort.equalsIgnoreCase("3")) {
			dreidiarr(antwort);
		}else if (antwort.equalsIgnoreCase("vier") || antwort.equalsIgnoreCase("4")) {
			vierdiarr(antwort);
		}
	}

	public static void zweidiarr(String antwort) throws IOException {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		int[][] mehrarr = new int [laenge][breite];
		System.out.println("============================");

		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.print("Geben sie f�r [" + i + "][" + j + "] den Wert ein: ");
				mehrarr[i][j] = IO.readInteger();
			}

		}


		System.out.println("============================");
		
		System.out.println("");		
		System.out.println("Sie hatten gew�hlt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie f�r alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		String wahl = IO.readString();
				
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			
		}else {
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

				}
			}
		}
		
		

	}

	public static void dreidiarr(String antwort) throws IOException {

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
					System.out.print("Geben sie f�r [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
					mehrarr[i][j][j2] = IO.readInteger();
				}
			}			
		}
		
		System.out.println("============================");
		
		System.out.println("");		
		System.out.println("Sie hatten gew�hlt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie f�r alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		String wahl = IO.readString();
				
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			
		}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
						System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "]  hat den Wert ==> " + mehrarr[i][j][j2]);
					}
				}
			}
		}
		
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		
	}

	public static void vierdiarr(String antwort) throws IOException {

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
						System.out.print("Geben sie f�r [" + i + "][" + j + "][" + j2 + "][" + j3 + "]  den Wert ein: ");
						mehrarr[i][j][j2][j3] = IO.readInteger();
					}
				}
			}
			
		}
		System.out.println("");
		System.out.println("============================");
		
		System.out.println("");		
		System.out.println("Sie hatten gew�hlt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie f�r alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		String wahl = IO.readString();
				
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			
		}else if(wahl.equalsIgnoreCase("Alle") || wahl.equalsIgnoreCase("alle")){
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
	
}
