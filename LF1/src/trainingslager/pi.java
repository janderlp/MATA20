package trainingslager;

import oop.IO;

public class pi {

	public static void main(String[] args){
		System.out.println("Bis zu welcher Stelle möchten Sie?");
        int n = IO.readInteger();
        double i1 = 0;
        double i2 = 0;

        double summe = 0;

        for(int i = 0; i < n; i++){
             i1 = Math.pow(-1, i);
             i2 = 2 * i + 1;

            System.out.println(summe);
            summe += i1 / i2;
        }
        System.err.println(summe * 4);
    }
}