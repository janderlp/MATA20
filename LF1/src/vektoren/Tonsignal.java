package vektoren;

import java.io.IOException;

import oop.IO;

public class Tonsignal {

	public static void main(String[] args) throws IOException {
		
		

		int[] signal = IO.readIntegerArray1D();
		int [] ergebnis = new int[signal.length];
		ergebnis[0] = (signal[0] + signal[1]) / 2;
		ergebnis[ergebnis.length - 1] = (signal[signal.length - 2] + signal[signal.length - 1]) / 2;
		for (int i = 1; i < ergebnis.length - 1; i++) {
			ergebnis[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
		}
		System.out.println("Ursprungssignal:");
		for (int i = 0; i < signal.length; i++) {
			System.out.print(signal[i] + " ");
		}
		System.out.println("");
		System.out.println("Geglättetes Signal");
		for (int i = 0; i < ergebnis.length; i++) {
			System.out.print(ergebnis[i] + " ");
		}
	}

}
