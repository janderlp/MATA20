package oop;

import java.io.IOException;

public class TestIO {
	
	public static void main(String[] args) throws IOException {
		
	String[][] text = IO.readzweidiarrString(null);
	System.out.println();
	IO.writezweidiarrString(text);
	}
	
}
