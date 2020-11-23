package vektoren;

public class Lotto {

	public static void main(String[] args) {

		ohnezurueck();
		mitzurueck();

	}

	public static void ohnezurueck() {
		int[] lotto = new int[7];
		boolean wahl = false;
		System.out.println("die gezogenen Lottozahlen + Zusatzzahl sind: (ohne zurücklegen)");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 49);

			while(lotto[i] == 0 || lotto[i] > 49 || wahl == false){
				lotto[i] = (int) (Math.random() * 49);
				if(lotto[i] != 0 || lotto[i] <= 49) {
					wahl = true;
				}
			} 
		}
		sortieren(lotto);
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.print(lotto[i] + ", ");
		}


		lotto[6] = (int) (Math.random() * 49);
		System.out.println("");
		System.out.println(lotto[6]);
	}

	private static int[] sortieren(int[] lotto) {
		for (int j = 0; j < lotto.length - 1; j++) {

			for (int i2 = 0; i2 < lotto.length - 1; i2++) {
				if (lotto[i2] > lotto[i2 + 1]) {
					int c = lotto[i2];
					lotto[i2] = lotto[i2 + 1];
					lotto[i2 + 1] = c;
				}

			}
		}
		return lotto;
	}

	public static void mitzurueck() {
		int[] lotto = new int[7];
		boolean wahl = false;
		System.out.println("die gezogenen Lottozahlen + Zusatzzahl sind: (mit zurücklegen)");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 49);
			for(int i2 = 0; i2 < 6; i2++) {
	            lotto[i2] = (int)(Math.random() * 48) + 1;
	            for (int j = 0; j < 6; j++) {
	                if (lotto[i2] == lotto[j]) {
	                    if (i2 != j) {
	                        i2 = 0;
	                    }
	                }
	            }
	        }
			while(lotto[i] == 0 || lotto[i] > 49 || wahl == false){
				lotto[i] = (int) (Math.random() * 49);
				if(lotto[i] != 0 || lotto[i] <= 49) {
					wahl = true;
				}

		

			} 
		}
		
		sortieren(lotto);
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.print(lotto[i] + ", ");
		}

		lotto[6] = (int) (Math.random() * 49);
		System.out.println("");
				while(lotto[6] == 0 || lotto[6] > 49 || wahl == false){
				lotto[6] = (int) (Math.random() * 49);
				if(lotto[6] != 0 || lotto[6] <= 49) {
					wahl = true;
				}
			} 

			System.out.print(lotto[lotto.length - 1]);
			System.out.println("");



		}

	}

