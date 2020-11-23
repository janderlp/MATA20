package merhdimensionaleArrays;

import java.io.IOException;

import oop.IO;

public class MehrdimensionaleArraysLernen {

	public static void main(String[] args) throws IOException {
		
		
		//Ruft die Methode auswahl(null) auf
		auswahl(null);

	}
	
	//Methode zur Auswahl welchen Arrayypen man benutzen will
	public static void auswahl(String[] args) throws IOException {
		
		System.out.println("Wollen sie einen zwei, drei oder vierdimensionalen array erstellen und füllen?");
		System.out.print("Geben sie nur 2, 3, 4  oder  zwei, drei, vier ein: ");
		//Liest auf die Frage darüber eine Antwort ein
		String antwort = IO.readString();
		
		//If abfrage zur ermittlung welch Methode der Nutzer aufrufen will
		if (antwort.equalsIgnoreCase("zwei") || antwort.equalsIgnoreCase("2")) {
			zweidiarr(antwort);
		}else if (antwort.equalsIgnoreCase("drei") || antwort.equalsIgnoreCase("3")) {
			dreidiarr(antwort);
		}else if (antwort.equalsIgnoreCase("vier") || antwort.equalsIgnoreCase("4")) {
			vierdiarr(antwort);
		}
	}

	//Methode zur Erstellung und Ausgebung eines Zweidimesionlen Arrays
	public static void zweidiarr(String antwort) throws IOException {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		//Deklarieren des Arrays + längenzuweisung
		int[][] mehrarr = new int [laenge][breite];
		System.out.println("============================");

		//Wert zuweisung des eben Erstellten Arrays
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				System.out.print("Geben sie für [" + i + "][" + j + "] den Wert ein: ");
				mehrarr[i][j] = IO.readInteger();
			}

		}


		System.out.println("============================");
		
		System.out.println("");		
		System.out.println("Sie hatten gewählt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		//Liest auf die Frage darüber eine Antwort ein
		String wahl = IO.readString();
				
		
		//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2]");
			System.out.print("[x1]");
			int x1 = IO.readInteger();
			System.out.print("[x2]");
			int x2 = IO.readInteger();

			
			System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "] hat den Wert ==> " + mehrarr[x1][x2]);
		}else {
			for (int i = 0; i < mehrarr.length; i++) {
				for (int j = 0; j < mehrarr[i].length; j++) {
					System.out.println("Der Array an der Stelle [" + i + "][" + j + "] hat den Wert ==> " + mehrarr[i][j]);

				}
			}
		}
		
		

	}

	//Methode zur Erstellug uns Ausgebung eines Dreidimensionalen Arrays
	public static void dreidiarr(String antwort) throws IOException {

		System.out.print("Wie lang soll der Mehrdimensionale Array sein?: ");
		int laenge = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie breit soll der Array werden?: ");
		int breite = IO.readInteger();

		System.out.println(" ");
		System.out.print("Wie tief soll der Array werden?: ");
		int tiefe = IO.readInteger();

		//Deklarieren des Arrays + längenzuweisung
		int[][][] mehrarr = new int[laenge][breite][tiefe];
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		//Wertzuweisung des Erstellten Arrays
		for (int i = 0; i < mehrarr.length; i++) {
			for (int j = 0; j < mehrarr[i].length; j++) {
				for (int j2 = 0; j2 < mehrarr[i].length; j2++) {
					System.out.print("Geben sie für [" + i + "][" + j + "][" + j2 + "] den Wert ein: ");
					mehrarr[i][j][j2] = IO.readInteger();
				}
			}			
		}
		
		System.out.println("============================");
		
		System.out.println("");		
		System.out.println("Sie hatten gewählt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		String wahl = IO.readString();
		
		//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle		
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3]");
			System.out.print("[x1]");
			int x1 = IO.readInteger();
			System.out.print("[x2]");
			int x2 = IO.readInteger();
			System.out.print("[x3]");
			int x3 = IO.readInteger();
			
			System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "] hat den Wert ==> " + mehrarr[x1][x2][x3]);
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

	//Methode zur Erstellug uns Ausgebung eines vierdimensionalen Arrays
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

		//Deklarierung und längenzuweisung ins Arrays
		int[][][][] mehrarr = new int[laenge][breite][tiefe][vierte];
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		//Wertzuweisung des Erstellten Arrays
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
		System.out.println("Sie hatten gewählt: " + antwort);
		
		System.out.println("Wollen sie sich alle Werte anzeigen lassen oder nur einen bestimmten?");
		System.out.println("Geben sie für alle :  alle;  Alle  ein und wenn sie nur einen wollen:  einen;  Einen");
		String wahl = IO.readString();
		
		//If abfrage ob man scih nur einen Wert anzeigen lassen will oder alle	
		if (wahl.equalsIgnoreCase("Einen") || wahl.equalsIgnoreCase("einen")) {
			System.out.println("Geben sie der reihe nach ein welche Stelle sie aufrufen wollen: [x1][x2][x3][x4]");
			System.out.print("[x1]");
			int x1 = IO.readInteger();
			System.out.print("[x2]");
			int x2 = IO.readInteger();
			System.out.print("[x3]");
			int x3 = IO.readInteger();
			System.out.print("[x4]");
			int x4 = IO.readInteger();
			
			System.out.println("Der Array an der Stelle [" + x1 + "][" + x2 + "][" + x3 + "][" + x4 + "]   hat den Wert ==> " + mehrarr[x1][x2][x3][x4]);
			
			
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
