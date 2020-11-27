package matrizen;

import java.io.IOException;

import oop.IO;

public class Kino {

	public static void main(String[] args) throws IOException {
		
		boolean a = true;
		String[][] saal = erzeugeSaal();
		anzeigeSaal(saal);
		do {	
			System.out.println(" ");
			System.out.println("Was wollen sie machen?");
			System.out.println("Sie haben die Auswahl zwischen: ");
			System.out.println("(r) für Reservieren");
			System.out.println("(s) für Stornieren");
			System.out.println("(e) fürs beenden des Programms");
			
			String antwort = IO.readString();
			
			if (antwort.contains("r")) {
				reserviereplatz(saal);
			}else if(antwort.contains("s")) {
				storniereplatz(saal);
			}else if(antwort.contains("e")) {
				a = false;
			}
			
		} while(a == true);		

	}
	public static String[][] erzeugeSaal(){
		
		System.out.print("wie viele Reihen haben sie? = ");
		int reihen = IO.readInteger();
		
		System.out.print("wieviele Sitze haben sie in einer Reihe? = ");
		int sitze = IO.readInteger();
		
		String[][] saal = new String[reihen + 1][sitze + 1];
		
		saal[0][0] = " ";
		for (int i = 0; i < 1; i++) {
			for (int j = 1; j < saal[i].length; j++) {
				saal[i][j] = "Platz" + j;
			}
			
		}
		
		for (int i = 1; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				saal[i][j] = "Reihe " + i + "";
			}
		}
		
		for (int i = 1; i < saal.length; i++) {
			for (int j = 1; j < saal[i].length; j++) {
				saal[i][j] = "O";
			}
		}
		return saal;
	}
	public static void anzeigeSaal(String[][] saal){
		System.out.println("=============================================");
		System.out.println(" ");

		for (int i = 0; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				System.out.print(saal[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void reserviereplatz(String[][] saal) {
		System.out.println(" ");
		System.out.print("In welcher Reihe wollen sie einen Platz reservieren? = ");
		int reihe = IO.readInteger();
		
		System.out.print("Welchen Platz wollen sie in der Reihe " + reihe + " reservieren? = ");
		int platz = IO.readInteger();
	
		
		System.out.println(" ");
		if (saal[reihe][platz] == "O") {
			saal[reihe][platz] = "X";
		}else if(saal[reihe][platz] == "X") {
			System.out.println("Der Platz ist schon Belegt!");
		}
		anzeigeSaal(saal);
	
	
	}
	public static void storniereplatz(String[][] saal) {
		System.out.println(" ");
		System.out.print("In welcher Reihe wollen sie einen Platz Stornieren? = ");
		int reihe = IO.readInteger();
		System.out.println("");
		System.out.print("Welchen Platz wollen sie in Reihe " + reihe + " Stornieren? = ");
		int platz = IO.readInteger();
		
		if (saal[reihe][platz] == "X") {
			saal[reihe][platz] = "O";
		}else if(saal[reihe][platz] == "O") {
			System.out.println("Dieser Platz ist noch nicht belegt, sie können ihn nicht Stornieren");
		}
		anzeigeSaal(saal);
	}
}
