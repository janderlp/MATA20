package vektoren;

import java.io.IOException;
import java.util.Arrays;

import oop.IO;

public class Bubblesort {


	public static void main(String[] args) throws IOException {
		
		System.out.print("Wieviele zahlen wollen sie eingeben ? :");
		int laengezahlen = IO.readInteger();
		
		int [] zahlen = new int [laengezahlen];
		
		System.out.println(" ");
		System.out.println("geben sie nun die zahlen ein : ");
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = IO.readInteger();
		}
		Arrays.sort(zahlen);
		System.out.println(Arrays.toString(zahlen));
		
	}
}

