package merhdimensionaleArrays;

public class Extra {

	public static void main(String[] args) {
		
		/*
		 * String[Zeilen][Spalten]
		 */
		String[][] firstandlastname = new String[5][2] ;
		
		firstandlastname[0][0] = "Franz";
		firstandlastname[0][1] = "Bauer";
		
		firstandlastname[1][0] = "Felix";
		firstandlastname[1][1] = "Huber";

		firstandlastname[2][0] = "Fritz";
		firstandlastname[2][1] = "Meier";

		// Äußere for schleife: zeilenindex => i
		// Innere for schleife: Spaltenindex: => j
		for (int i = 0; i < firstandlastname.length; i++) {
			for (int j = 0; j < firstandlastname[i].length; j++) {
				System.out.println(firstandlastname[i][j]);
			}
		}
		


	}

}
