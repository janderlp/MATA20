package trainingslager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsummen {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		System.out.println("Gebe die Zahl an bis wohin du quadrieren willst");
		String entwert = br.readLine();
		int summen = Integer.parseInt(entwert.trim().replace(',','.'));
		
		for (int i = 1; i <= summen; i++) {

			System.out.println(i + "====" + i * i);		
		}

	}
}