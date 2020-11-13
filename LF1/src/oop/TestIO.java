package oop;

import java.io.IOException;

public class TestIO {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Nenne mir deinen Namen");
		String name = IO.readString();

		
		System.out.println("Wie Alt bist du?");
		int alter = IO.readInteger();
		
		System.out.println("Wie Gross bist du ?");
		double groese = IO.readDouble();
		
		System.out.println("Bist du Raucher ?");
		boolean raucher = IO.readBoolean();
	
		System.out.println("===============================\n");
		System.out.println("Name: " + name);
		System.out.println("Alter: " + alter);
		System.out.println("Groesse: " + groese);
		System.out.println("Raucher: " + raucher + "\n");
		System.out.println("===============================");


	
	}
	
}
