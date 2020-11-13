package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * Liest einen Text ein
	 * @return den eingelesenen Text
	 */
	public static String readString() throws IOException {
		return bufferedReader.readLine();
	}
	/**
	 * Liest eine Ganze Zahl ein
	 * @return gibt eine ganze zahl aus
	 */
	public static int readInteger() {
		while (true) {
			try {
				return Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Bitte geben sie nur Zahlen ein");
			}
		}
	}
	/**
	 * Liest eine zahl mit nachkommastellen ein
	 * @return gibt diese aus
	 */
	public static Double readDouble() {
		while (true) {
			try {
				return Double.parseDouble(bufferedReader.readLine().replace(',','.'));
			} catch (NumberFormatException | IOException e) {
				System.out.println("Bitte nur Zahlen ein");
			}
		}
	}
	/**
	 * fragt bedingungen ab
	 * @return gibt true oder false aus
	 */
	public static Boolean readBoolean() {
		while (true) {
			try {
				String eingabe = bufferedReader.readLine();
				if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes")) {
					return true;
							
				} else if (eingabe.equalsIgnoreCase("nein") || eingabe.equalsIgnoreCase("no")){
					return false;
				} else {
					System.out.println("Geben sie nur ja,yes,,nein,no ein");
				}
			} catch (Exception e) {
				System.out.println("Geben sie nur ja,yes,,nein,no ein");
			}
		}
	}
}

