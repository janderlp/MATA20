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
	
    public static int[] createIntArray(int arrLength){
        while(true){
            try{
                int[] intArr = new int[arrLength];
                for(int i = 0; i < intArr.length; i++){
                    System.out.println("Bitte geben Sie die " + i + " Ganzzahl im Array jetzt ein: ");
                    intArr[i] = readInteger();
                }
                return intArr;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates an Double Array in the desired length.
     * @param arrLength Length of the Array
     * @return double[]
     */
    public static double[] createDoubleArray(int arrLength){
        while(true){
            try{
                double[] doubleArr = new double[arrLength];
                for(int i = 0; i < doubleArr.length; i++){
                    System.out.println("Bitte geben Sie die " + i + " Double Zahl im Array jetzt ein: ");
                    doubleArr[i] = readDouble();
                }
                return doubleArr;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates an String Array in the desired length.
     * @param arrLength Length of the Array
     * @return String[]
     */
    public static String[] createStringArr(int arrLength){
        while(true){
            try{
                String[] stringArr = new String[arrLength];
                for(int i = 0; i < stringArr.length; i++){
                    System.out.println("Bitte geben Sie den " + i + "'ten String im Array jetzt ein: ");
                    stringArr[i] = readString();
                }
                return stringArr;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

