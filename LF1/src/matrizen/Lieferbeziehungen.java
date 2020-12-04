package matrizen;

import java.io.IOException;

import oop.IO;

public class Lieferbeziehungen {

	public static void main(String[] args) throws IOException {

		System.out.print("Wieviele Artikel haben sie angeboten ? : ");
		int artikel = IO.readInteger();
		System.out.println(" ");
		System.out.print("Wieviele Kunden haben sie, die Produkte gekauft haben ? : ");
		int kunden = IO.readInteger();

		System.out.println(" ");

		int[][] matrix1 = new int[artikel][kunden];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.println("Geben sie für die Matrix 1 an der Stelle " + i + " , " + j + " einen Wert ein");
				matrix1[i][j] =IO.readInteger();
			}
		}
		System.out.println("=============================================");
		System.out.println(" ");

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t\t");
			}
			System.out.println("");
		}
		System.out.println(" ");
		int[][] matrix2 = new int[artikel][kunden];

		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.println("Geben sie für die Matrix 2 an der Stelle " + i + " , " + j + " einen Wert ein");
				matrix2[i][j] =IO.readInteger();
			}
		}
		System.out.println(" ");
		
		int[][] matrixsumme = new int[artikel][kunden];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrixsumme[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println(" ");
		System.out.println("Matrix 1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t\t");
			}
			System.out.println("");
		}
		System.out.println(" ");
		System.out.println("Matrix 2: ");

		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t\t");
			}
			System.out.println("");

		}
		System.out.println(" ");
		System.out.println("Matrixsumme: ");
		
		System.out.println(" ");
		for (int i = 0; i < matrixsumme.length; i++) {
			for (int j = 0; j < matrixsumme[i].length; j++) {
				System.out.print(matrixsumme[i][j] + "\t\t");
			}
			System.out.println("");
		}
		int[][] spaltenrechnung = new int [artikel + 1][kunden + 1];
		for (int i = 0; i < spaltenrechnung.length; i++) {
			for (int j = 0; j < spaltenrechnung[i].length; j++) {
				spaltenrechnung[artikel][kunden] = spaltenrechnung[artikel][kunden] + matrixsumme[i][j];
			}
			
		}
		for (int i = 0; i < spaltenrechnung.length; i++) {
			for (int j = 0; j < spaltenrechnung.length; j++) {
				System.out.println(spaltenrechnung[i][j]);
			}
		}
	}
}

